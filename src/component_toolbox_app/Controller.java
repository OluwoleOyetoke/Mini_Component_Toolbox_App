/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component_toolbox_app;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.paint.Color;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.math.plot.Plot2DPanel;
import org.math.plot.plotObjects.BaseLabel;

/**
 *
 * @author olu
 */
public class Controller implements Runnable {

    private static Controller control;
    int n, m;

// Lookup tables.  Only need to recompute when size of FFT changes.
    double[] cos;
    double[] sin;

    double[] window;
    Thread thread;

    //Thread for Logo Anaimation on Welcome Screen
    public void run() {
        Model model = Model.getModelObject(); //Create the Model class object
        Random rand = new Random(); //Create the random number generator object
        String[] imageList = model.getImageList(); //Get the image list for the animation from the Model Class

        //Display Initial Welcome Logo on the WelcomeView View
        Image logo;
        try {
            logo = ImageIO.read(getClass().getResource("RTB_Logo_EC0.jpg"));
            ImageIcon display = new ImageIcon(ScaledImage(logo, 388, 259)); //Scale image to fit
            WelcomeView.LogoLabel.setIcon(display);
        } catch (Exception e) {
            ErrorMessages("Image Display Error: " + e);
        }

        int Counter = 0;
        while (model.getBlinkCommand() == true) {
            if (Counter < 20) {
                int ImageToUse = rand.nextInt(5);
                for (int i = 0; i < 3; i++) {

                    Image logo2;
                    try {
                        logo2 = ImageIO.read(getClass().getResource(imageList[i]));
                        ImageIcon display = new ImageIcon(ScaledImage(logo2, 388, 259)); //Scale image to fit
                        WelcomeView.LogoLabel.setIcon(display);
                        if (i == 0) {
                            Delay(1000);

                        }
                        Delay(25);

                    } catch (Exception e) {
                        ErrorMessages("Image Display Error: " + e);
                    }

                }
            } else {
                WelcomeView.SleepLabel.setText("I feel a little Sleepy. I'd like to take a nap. Please click on 'Proceed' when you need me");
                Image logo3;
                try {
                    logo3 = ImageIO.read(getClass().getResource("RTB_Logo_EC4.jpg"));
                    ImageIcon display = new ImageIcon(ScaledImage(logo3, 388, 259));
                    WelcomeView.LogoLabel.setIcon(display);
                } catch (Exception e) {
                    ErrorMessages("Image Display Error: " + e);
                }
                break;
            }
            Counter = Counter + 1;
        }
    }

    //Method Used to Scale the Image to Size
    private Image ScaledImage(Image img, int w, int h) {
        BufferedImage resizedImage = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = resizedImage.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(img, 0, 0, w, h, null);
        g2.dispose();
        return resizedImage;
    }

    //Method used to start the logo blinker thread
    public void startBlinker() {
        Controller controller = new Controller();
        Model model = Model.getModelObject();
        Thread thread = new Thread(controller);
        model.setBlinkCommand(true);
        thread.start();
    }

    //Method used to initiate a thread delay
    public void Delay(int Time) {
        try {
            Thread.sleep(Time);
        } catch (InterruptedException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //Method used to return Controller class object
    public static Controller getControllerObject() {
        if (control == null) {
            control = new Controller();
        }
        return control;
    }

    //MESSAGES
//Display error message
    public void ErrorMessages(String Message) {
        JOptionPane.showMessageDialog(Component_Toolbox_App.mainframe, Message, "ERROR", JOptionPane.ERROR_MESSAGE);
    }

    //Display information message
    public void InformationMessages(String Message) {
        JOptionPane.showMessageDialog(Component_Toolbox_App.mainframe, Message, "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
    }

    //Diaplay Confirmation Message
    public int ConfirmationMessage(String Message) {

        int Selected = JOptionPane.showConfirmDialog(Component_Toolbox_App.mainframe, Message, "Please Confirm", JOptionPane.YES_NO_OPTION);

        return Selected;
    }

    //LOAD VIEWS
    public void loadResistorColourBandView() {
        Component_Toolbox_App.mainframe.setContentPane(Component_Toolbox_App.rcbv);
        Component_Toolbox_App.mainframe.validate();
    }

    public void loadCapacitorColourBandView() {

        Component_Toolbox_App.mainframe.setContentPane(Component_Toolbox_App.ccbv);
        Component_Toolbox_App.mainframe.validate();
    }

    public void loadResistorListView() {
        Component_Toolbox_App.mainframe.setContentPane(Component_Toolbox_App.rlv);
        Component_Toolbox_App.mainframe.validate();
    }

    public void loadSpectrumAnalyserView() {
        Component_Toolbox_App.mainframe.setContentPane(Component_Toolbox_App.sav);
        Component_Toolbox_App.mainframe.validate();
    }

    public void loadResistorDetailsView() {
        ResistorInfoView riv = new ResistorInfoView();
        Component_Toolbox_App.mainframe.setContentPane(riv);
        Component_Toolbox_App.mainframe.validate();
    }

    //SET CURRENT BAND COLOUR
    public void selectBandColour(int currentBand, Color col) {
        Model model = Model.getModelObject();
        if (currentBand == 1) {
            model.setResistorBand1Colour(col);
        } else if (currentBand == 2) {
            model.setResistorBand2Colour(col);
        } else if (currentBand == 3) {
            model.setResistorBand3Colour(col);
        } else if (currentBand == 4) {
            model.setResistorBand4Colour(col);
        } else if (currentBand == 5) {
            model.setResistorBand5Colour(col);
        } else if (currentBand == 6) {
            model.setResistorBand6Colour(col);
        }

        //Refresh View
        Component_Toolbox_App.rcbv.repaint();
        // Component_Toolbox_App.mainframe.validate();

    }

    //GET AWT VERSION OF COLUR, SINCE FX VERSION CANNOT BE APPLIED TO SWING
    public java.awt.Color getAWTColourVersion(javafx.scene.paint.Color colourRecieved) {
        java.awt.Color awtColor = new java.awt.Color((float) colourRecieved.getRed(),
                (float) colourRecieved.getGreen(),
                (float) colourRecieved.getBlue(),
                (float) colourRecieved.getOpacity());
        return awtColor;
    }

    //GET COLOUR NAME FROM COLOUR OBJECT
    public String getColourName(javafx.scene.paint.Color colourRecieved) {
        String toReturn = "";
        if (colourRecieved == Color.BLACK) {
            toReturn = "Black";
        } else if (colourRecieved == Color.BROWN) {
            toReturn = "Brown";
        } else if (colourRecieved == Color.RED) {
            toReturn = "Red";
        } else if (colourRecieved == Color.ORANGE) {
            toReturn = "Orange";
        } else if (colourRecieved == Color.YELLOW) {
            toReturn = "Yellow";
        } else if (colourRecieved == Color.GREEN) {
            toReturn = "Green";
        } else if (colourRecieved == Color.BLUE) {
            toReturn = "Blue";
        } else if (colourRecieved == Color.VIOLET) {
            toReturn = "Violet";
        } else if (colourRecieved == Color.GREY) {
            toReturn = "Grey";
        } else if (colourRecieved == Color.WHITE) {
            toReturn = "White";
        } else if (colourRecieved == Color.GOLD) {
            toReturn = "Gold";
        } else if (colourRecieved == Color.SILVER) {
            toReturn = "Silver";
        } else if (colourRecieved == Color.PINK) {
            toReturn = "PINK";
        } else {
            toReturn = "No Selection";
        }
        return toReturn;
    }

    public String setDefaultSelectionName() {
        return "No Selection";
    }

    //CALCULATE 4 BAND REISTANCE VALUE FROM THE BAND COLOURS
    public double[] get4BandResistance(Color band1, Color band2, Color band3, Color band4) {
        //Get first 3 digits
        String first2Bands = "";
        int band1D = (int) getResistorColourValue(band1, "Digits");
        int band2D = (int) getResistorColourValue(band2, "Digits");

        first2Bands = band1D + "" + band2D;
        System.out.println(first2Bands);
        int first2BandsD = Integer.parseInt(first2Bands);

        //Get Multiplier
        double band3D = getResistorColourValue(band3, "Multiplier");
        double first3BnandsD = 0;
        if (band4 != Color.GOLD && band4 != Color.SILVER) {
            first3BnandsD = first2BandsD * band3D;
        } else {
            System.out.println("Before Effect: " + first3BnandsD);
            first3BnandsD = first2BandsD / band3D;
            System.out.println("Gold And Silver Effect: " + first3BnandsD);
        }
        //Get Tolerance Value
        double band4D = getResistorColourValue(band4, "Tolerance");

        double[] toReturn = new double[2];
        toReturn[0] = first3BnandsD;
        toReturn[1] = band4D;
        return toReturn;

    }

    //CALCULATE 4 BAND TANTALUM CAPACITANCE VALUE FROM ITS BAND COLOURS
    public double[] get4BandCapacitance(Color band1, Color band2, Color band3, Color band4) {
        //Get first 3 digits
        String first2Bands = "";
        int band1D = (int) getCapacitorColourValue(band1, "Digits");
        int band2D = (int) getCapacitorColourValue(band2, "Digits");

        first2Bands = band1D + "" + band2D;
        System.out.println(first2Bands);
        int first2BandsD = Integer.parseInt(first2Bands);

        //Get Multiplier
        double band3D = getCapacitorColourValue(band3, "Multiplier");
        double first3BnandsD = 0;

        first3BnandsD = first2BandsD * band3D;

        //Get Tolerance Value
        double band4D = getCapacitorColourValue(band4, "Voltage");

        double[] toReturn = new double[2];
        toReturn[0] = first3BnandsD;
        toReturn[1] = band4D;
        return toReturn;

    }

    //CALCULATE 4 BAND REISTANCE VALUE FROM THE BAND COLOURS
    public double[] get5BandResistance(Color band1, Color band2, Color band3, Color band4, Color band5) {
        //Get first 3 digits
        String first3Bands = "";
        int band1D = (int) getResistorColourValue(band1, "Digits");
        int band2D = (int) getResistorColourValue(band2, "Digits");
        int band3D = (int) getResistorColourValue(band3, "Digits");

        first3Bands = band1D + "" + band2D + "" + band3D;
        System.out.println(first3Bands);
        int first3BandsD = Integer.parseInt(first3Bands);

        //Get Multiplier
        double band4D = getResistorColourValue(band4, "Multiplier");
        double first4BnandsD = 0;
        if (band4 != Color.GOLD && band4 != Color.SILVER) {
            first4BnandsD = first3BandsD * band4D;
        } else {
            //System.out.println("Before Effect: "+first4BnandsD);
            first4BnandsD = first3BandsD / band4D;
            //System.out.println("Gold And Silver Effect: "+first4BnandsD);
        }

        //Get Tolerance Value
        double band5D = getResistorColourValue(band5, "Tolerance");

        double[] toReturn = new double[2];
        toReturn[0] = first4BnandsD;
        toReturn[1] = band5D;
        return toReturn;

    }

    //GET NUMERICAL VALUE OF THE CURRENT BAND WE ARE ON, BASED ON ITS COLOUR
    //AND POSITION.---FOR RESISTORS
    public double getResistorColourValue(Color colourReceived, String Type) {
        if (colourReceived == Color.BLACK) {
            if (Type.equals("Digits")) {
                return 0;
            } else if (Type.equals("Multiplier")) {
                return 1;
            } else if (Type.equals("Tolerance")) {
                return 0;
            } else {
                return 0;
            }
        } else if (colourReceived == Color.BROWN) {
            if (Type.equals("Digits")) {
                return 1;
            } else if (Type.equals("Multiplier")) {
                return 10;
            } else if (Type.equals("Tolerance")) {
                return 1;
            } else {
                return 0;
            }
        } else if (colourReceived == Color.RED) {
            if (Type.equals("Digits")) {
                return 2;
            } else if (Type.equals("Multiplier")) {
                return 100;
            } else if (Type.equals("Tolerance")) {
                return 2;
            } else {
                return 0;
            }
        } else if (colourReceived == Color.ORANGE) {
            if (Type.equals("Digits")) {
                return 3;
            } else if (Type.equals("Multiplier")) {
                return 1000;
            } else if (Type.equals("Tolerance")) {
                return 3;
            } else {
                return 0;
            }
        } else if (colourReceived == Color.YELLOW) {
            if (Type.equals("Digits")) {
                return 4;
            } else if (Type.equals("Multiplier")) {
                return 10000;
            } else if (Type.equals("Tolerance")) {
                return 4;
            } else {
                return 0;
            }
        } else if (colourReceived == Color.GREEN) {
            if (Type.equals("Digits")) {
                return 5;
            } else if (Type.equals("Multiplier")) {
                return 100000;
            } else if (Type.equals("Tolerance")) {
                return 0.5;
            } else {
                return 0;
            }
        } else if (colourReceived == Color.BLUE) {
            if (Type.equals("Digits")) {
                return 6;
            } else if (Type.equals("Multiplier")) {
                return 1000000;
            } else if (Type.equals("Tolerance")) {
                return 0.25;
            } else {
                return 0;
            }
        } else if (colourReceived == Color.VIOLET) {
            if (Type.equals("Digits")) {
                return 7;
            } else if (Type.equals("Multiplier")) {
                return 10000000;
            } else if (Type.equals("Tolerance")) {
                return 0.1;
            } else {
                return 0;
            }
        } else if (colourReceived == Color.GREY) {
            if (Type.equals("Digits")) {
                return 8;
            } else if (Type.equals("Multiplier")) {
                return 100000000;
            } else if (Type.equals("Tolerance")) {
                return 0.05;
            } else {
                return 0;
            }
        } else if (colourReceived == Color.WHITE) { //REPRESENTING WHITE
            if (Type.equals("Digits")) {
                return 9;
            } else if (Type.equals("Multiplier")) {
                return 1000000000;
            } else if (Type.equals("Tolerance")) {
                return 0;
            } else {
                return 0;
            }
        } else if (colourReceived == Color.GOLD) {
            if (Type.equals("Digits")) {
                return 0;
            } else if (Type.equals("Multiplier")) {
                return 10;
            } else if (Type.equals("Tolerance")) {
                return 5;
            } else {
                return 0;
            }
        } else if (colourReceived == Color.SILVER) {
            if (Type.equals("Digits")) {
                return 0;
            } else if (Type.equals("Multiplier")) {
                return 100;
            } else if (Type.equals("Tolerance")) {
                return 10;
            } else {
                return 0;
            }
        } else {
            return 0;
        }

    }

    //GET NUMERICAL VALUE OF THE CURRENT BAND WE ARE ON, BASED ON ITS COLOUR
    //AND POSITION.---FOR CAPACITORS
    public double getCapacitorColourValue(Color colourReceived, String Type) {
        if (colourReceived == Color.BLACK) {
            if (Type.equals("Digits")) {
                return 0;
            } else if (Type.equals("Multiplier")) {
                return 1;
            } else if (Type.equals("Voltage")) {
                return 10;
            } else {
                return 0;
            }
        } else if (colourReceived == Color.BROWN) {
            if (Type.equals("Digits")) {
                return 1;
            } else if (Type.equals("Multiplier")) {
                return 10;
            } else if (Type.equals("Voltage")) {
                return 1; //In real life, this colour is never used for the voltage band
            } else {
                return 0;
            }
        } else if (colourReceived == Color.RED) {
            if (Type.equals("Digits")) {
                return 2;
            } else if (Type.equals("Multiplier")) {
                return 100;
            } else if (Type.equals("Voltage")) {
                return 1; //In real life, this colour is never used for the voltage band
            } else {
                return 0;
            }
        } else if (colourReceived == Color.ORANGE) {
            if (Type.equals("Digits")) {
                return 3;
            } else if (Type.equals("Multiplier")) {
                return 1; //In real life, this colour is never used for the multiiplier band
            } else if (Type.equals("Voltage")) {
                return 1; //In real life, this colour is never used for the voltage band
            } else {
                return 0;
            }
        } else if (colourReceived == Color.YELLOW) {
            if (Type.equals("Digits")) {
                return 4;
            } else if (Type.equals("Multiplier")) {
                return 1; //In real life, this colour is never used for the multiiplier band
            } else if (Type.equals("Voltage")) {
                return 6.3;
            } else {
                return 0;
            }
        } else if (colourReceived == Color.GREEN) {
            if (Type.equals("Digits")) {
                return 5;
            } else if (Type.equals("Multiplier")) {
                return 1; //In real life, this colour is never used for the multiiplier band
            } else if (Type.equals("Voltage")) {
                return 16;
            } else {
                return 0;
            }
        } else if (colourReceived == Color.BLUE) {
            if (Type.equals("Digits")) {
                return 6;
            } else if (Type.equals("Multiplier")) {
                return 1; //In real life, this colour is never used for the multiiplier band
            } else if (Type.equals("Voltage")) {
                return 20;
            } else {
                return 0;
            }
        } else if (colourReceived == Color.VIOLET) {
            if (Type.equals("Digits")) {
                return 7;
            } else if (Type.equals("Multiplier")) {
                return 1; //In real life, this colour is never used for the multiiplier band
            } else if (Type.equals("Voltage")) {
                return 1; //In real life, this colour is never used for the voltage band
            } else {
                return 0;
            }
        } else if (colourReceived == Color.GREY) {
            if (Type.equals("Digits")) {
                return 8;
            } else if (Type.equals("Multiplier")) {
                return 0.1;
            } else if (Type.equals("Voltage")) {
                return 25;
            } else {
                return 0;
            }
        } else if (colourReceived == Color.WHITE) { //REPRESENTING WHITE
            if (Type.equals("Digits")) {
                return 9;
            } else if (Type.equals("Multiplier")) {
                return 0.1;
            } else if (Type.equals("Voltage")) {
                return 3;
            } else {
                return 0;
            }
        } else if (colourReceived == Color.PINK) {
            if (Type.equals("Digits")) {
                return 0; //In real life, this colour is never used for the digit band
            } else if (Type.equals("Multiplier")) {
                return 1; //In real life, this colour is never used for the multiiplier band
            } else if (Type.equals("Voltage")) {
                return 35;
            } else {
                return 0;
            }
        } else {
            return 0;
        }

    }

    //TRIGGER REISTANCE CALCULATION, WHENEVER A COLOUR BAND IS CHANGED
    public void triggerResistorCalculator(String Type) {
        String plusMINUS = "\u00b1";
        Model model = Model.getModelObject();
        Controller control = Controller.getControllerObject();
        if (Type.equals("FIVE")) {
            double[] valueNTolerance = control.get5BandResistance(model.getResistorBand1Colour(), model.getResistorBand2Colour(), model.getResistorBand3Colour(), model.getResistorBand4Colour(), model.getResistorBand5Colour());
            String resultWithUnits = unitAdder(valueNTolerance[0], "Resistor");
            model.setCurrentResistanceResult("Resistance: " + resultWithUnits + " " + plusMINUS + "" + valueNTolerance[1] + "%");

        } else if (Type.equals("FOUR")) {
            double[] valueNTolerance = control.get4BandResistance(model.getResistorBand1Colour(), model.getResistorBand2Colour(), model.getResistorBand3Colour(), model.getResistorBand4Colour());
            String resultWithUnits = unitAdder(valueNTolerance[0], "Resistor");
            model.setCurrentResistanceResult("Resistance: " + resultWithUnits + " " + plusMINUS + "" + valueNTolerance[1] + "%");
        }
    }

    //TRIGGER CAPACIANCE CALCULATION, WHENEVER A COLOUR BAND IS CHANGED
    public void triggerCapacitorCalculator() {
        String plusMINUS = "\u00b1";
        Model model = Model.getModelObject();
        Controller control = Controller.getControllerObject();
        double[] valueNVoltage = control.get4BandCapacitance(model.getTantalumBand1Colour(), model.getTantalumBand2Colour(), model.getTantalumBand3Colour(), model.getTantalumBand4Colour());
        String resultWithUnits = unitAdder(valueNVoltage[0], "Capacitor");
        model.setCurrentCapacitanceResult("Capacitance: " + resultWithUnits + " , " + valueNVoltage[1] + " V");
    }

    //ADD APPROPRIATE UNIT TO THE CAPACITOR AND RESISTOR E.G 2k2R
    public String unitAdder(double value, String Type) {
        String toReturn = "";
        if (Type.equals("Resistor")) {

            String OHMS = "\u2126";
            if (value < 1000) {
                toReturn = "" + value + " " + OHMS;
            } else if (value >= 1000 && value < 1000000) {
                if (value % 1000 == 0) {
                    int kVal1 = (int) value / 1000;
                    toReturn = "" + kVal1 + " k" + OHMS;
                } else {
                    double kVal2 = value / 1000;
                    String kVal2String = String.valueOf(kVal2);
                    kVal2String = kVal2String.replace(".", "k");
                    toReturn = "" + kVal2String + "R ";
                }
            } else if (value >= 1000000 && value < 1000000000) {
                if (value % 1000000 == 0) {
                    int kVal1 = (int) value / 1000;
                    toReturn = "" + kVal1 + " M" + OHMS;
                } else {
                    double kVal2 = value / 1000000;
                    String kVal2String = String.valueOf(kVal2);
                    // kVal2String = kVal2String.replace(".", "M");
                    toReturn = "" + kVal2String + " M" + OHMS;
                }
            } else if (value >= 1000000000) {
                if (value % 1000000000 == 0) {
                    int kVal1 = (int) value / 1000000000;
                    toReturn = "" + kVal1 + " G" + OHMS;
                } else {
                    double kVal2 = value / 1000000000;
                    String kVal2String = String.valueOf(kVal2);
                    //kVal2String = kVal2String.replace(".", "G");
                    toReturn = "" + kVal2String + " " + OHMS;
                }
            }
        } else if (Type.equals("Capacitor")) {
            String FARAD = "pF";
            double newValue = value / 10;
            toReturn = "" + newValue + " " + FARAD;
        }

        return toReturn;

    }

    //INITIALIZE THE ABOUT FRAME
    public void initAboutViewDisplay() {

        Image logo;
        try {
            logo = ImageIO.read(getClass().getResource("RTB_Logo_EC0.jpg"));
            ImageIcon display = new ImageIcon(ScaledImage(logo, 112, 100));
            AboutView.LogoLabel.setIcon(display);
        } catch (Exception e) {
            ErrorMessages("Image Display Error: " + e);
        }
        Image logo2;
        try {
            logo2 = ImageIO.read(getClass().getResource("RTB_Olu2_About.jpg"));
            ImageIcon display = new ImageIcon(ScaledImage(logo2, 95, 134));
            AboutView.ProfileLabel.setIcon(display);
        } catch (Exception e) {
            ErrorMessages("Image Display Error: " + e);
        }
    }

    //INITIALIZE REISTOR LIST VIEW
    public void initResistorListView() {
        Model model = Model.getModelObject();
        String OHMS = "\u2126";
        Controller control = Controller.getControllerObject();
        ResistorListView.seriesCombo.removeAllItems();
        ResistorListView.resistorCombo.removeAllItems();
        String[] seriesList = model.getSeriesList();
        String[] resistorList = model.getE24List();
        for (int i = 0; i < seriesList.length; i++) {
            ResistorListView.seriesCombo.addItem(seriesList[i]);
            ResistorListView.resistorCombo.addItem(seriesList[i] + " " + OHMS);
        }
        for (int i = 0; i < resistorList.length; i++) {
            ResistorListView.resistorCombo.addItem(resistorList[i] + " " + OHMS);
        }
    }

    //LOAD RESISTOR VALUES INTO COMBO BOX
    public void loadResistorValues(String series) {
        String OHMS = "\u2126";
        Model model = Model.getModelObject();
        ResistorListView.resistorCombo.removeAllItems();
        if (series.equals("E24")) {
            String[] resistorList = model.getE24List();
            for (int i = 0; i < resistorList.length; i++) {
                ResistorListView.resistorCombo.addItem(resistorList[i] + " " + OHMS);
            }
        } else if (series.equals("E12")) {
            String[] resistorList = model.getE12List();
            for (int i = 0; i < resistorList.length; i++) {
                ResistorListView.resistorCombo.addItem(resistorList[i] + " " + OHMS);
            }
        } else if (series.equals("E6")) {
            String[] resistorList = model.getE6List();
            for (int i = 0; i < resistorList.length; i++) {
                ResistorListView.resistorCombo.addItem(resistorList[i] + " " + OHMS);
            }
        } else if (series.equals("E3")) {
            String[] resistorList = model.getE3List();
            for (int i = 0; i < resistorList.length; i++) {
                ResistorListView.resistorCombo.addItem(resistorList[i] + " " + OHMS);
            }
        }
    }

    //DETAILS GENERATION FOR RESISTORS
    public void generateResistorDetails(String series, String value) {
        Random rand = new Random(); //Used to generate random prices and order numbers
        Model model = Model.getModelObject();
        double randomPrice = 0.1;
        randomPrice = rand.nextInt(10) + 1;
        randomPrice = randomPrice / 10;
        String formatted = String.format("%.2f", randomPrice);
        model.setCurrentResistorPrice(formatted);
        model.setCurrentResistorOrderNumber(String.valueOf(rand.nextInt(10000000)));
        model.setCurrentResistorSeries(series);
        model.setCurrentResistorValue(value);
    }

    //USED TO DISPLAY THE RANDOMLY GENERATED RESISTOR DETAILS
    public void writeOutCurrentResistorDetails() {
        Model model = Model.getModelObject();
        ResistorInfoView.rDetailsTextArea.append("SERIES:    " + model.getCurrentResistorSeries() + "\n");
        ResistorInfoView.rDetailsTextArea.append("VALUE:     " + model.getCurrentResistorValue() + "\n");
        ResistorInfoView.rDetailsTextArea.append("ORDER NO.: " + model.getCurrentResistorOrderNumber() + "\n");
        ResistorInfoView.rDetailsTextArea.append("PRICE:     " + model.getCurrentResistorPrice() + " £\n");
    }

    //INITIALIZE VIEWS
    public void initializeTantalumView() {
        Model model = Model.getModelObject();
        model.setCapacitorViewInitFlag(1);

//Clear initial contents in the combobox
        CapacitorColourBandView.band1Combo.removeAllItems();
        CapacitorColourBandView.band2Combo.removeAllItems();
        CapacitorColourBandView.band3Combo.removeAllItems();
        CapacitorColourBandView.band4Combo.removeAllItems();

        //Load in colours to the combo boxes
        String[] stringColours = model.getTantalumStringColourList();

        for (int i = 0; i < stringColours.length; i++) {
            CapacitorColourBandView.band1Combo.addItem(stringColours[i]);
            CapacitorColourBandView.band2Combo.addItem(stringColours[i]);
            CapacitorColourBandView.band3Combo.addItem(stringColours[i]);
            CapacitorColourBandView.band4Combo.addItem(stringColours[i]);
        }

        model.setCapacitorViewInitFlag(0);
    }

    //GET COLOUR OBJECT FROM COLOUR NAME
    public Color getColourObject(String colourName) {
        Color toReturn = null;
        if (colourName.equals("BLACK")) {
            toReturn = Color.BLACK;
        } else if (colourName.equals("BROWN")) {
            toReturn = Color.BROWN;
        } else if (colourName.equals("RED")) {
            toReturn = Color.RED;
        } else if (colourName.equals("ORANGE")) {
            toReturn = Color.ORANGE;
        } else if (colourName.equals("YELLOW")) {
            toReturn = Color.YELLOW;
        } else if (colourName.equals("GREEN")) {
            toReturn = Color.GREEN;
        } else if (colourName.equals("BLUE")) {
            toReturn = Color.BLUE;
        } else if (colourName.equals("VIOLET")) {
            toReturn = Color.VIOLET;
        } else if (colourName.equals("GREY")) {
            toReturn = Color.GREY;
        } else if (colourName.equals("WHITE")) {
            toReturn = Color.WHITE;
        } else if (colourName.equals("GOLD")) {
            toReturn = Color.GOLD;
        } else if (colourName.equals("SILVER")) {
            toReturn = Color.SILVER;
        } else if (colourName.equals("PINK")) {
            toReturn = Color.PINK;
        } else {
            toReturn = null;
        }
        return toReturn;
    }

    //GENERATE TIME PLOT FOR SPECTAL ANALYSIS
    public void generateTimePlot(int frequency, int samplingRate, String Type, int[] input) {
        Model model = Model.getModelObject();
        Controller control = new Controller();

        double[] sampledSignalResult = new double[samplingRate];
        if (Type.equals("SINE")) {
            sampledSignalResult = sampleWave(samplingRate, frequency, "SINE");
            plotSignal(control.getTimeSteps(samplingRate), sampledSignalResult, "SINE CARRIER", "SIGNAL");
            SpectrumAnalyzerView.internalFrame.setContentPane(model.getPlot());
        } else if (Type.equals("COSINE")) {
            sampledSignalResult = sampleWave(samplingRate, frequency, "COSINE");
            plotSignal(control.getTimeSteps(samplingRate), sampledSignalResult, "COSINE CARRIER", "SIGNAL");
            SpectrumAnalyzerView.internalFrame.setContentPane(model.getPlot());
        } else if (Type.equals("SQUARE")) {
            int[] squareWaveSamples = sampleSquareWave(input, samplingRate);
            double[] doubleSquareWaveSamples = convertIntToDouble(squareWaveSamples);
            plotSignal(getTimeSteps(samplingRate), doubleSquareWaveSamples, "SQUARE WAVE", "SIGNAL");
            SpectrumAnalyzerView.internalFrame.setContentPane(model.getPlot());
        }

    }

    //GET f SAMPLES OF THE INPUTED WAVE
    public double[] sampleWave(int size, int f, String Type) {
        double t = 0;
        double[] carrierArray = new double[size];
        for (int i = 0; i <= (size - 1); i++) {
            if (Type.equals("SINE")) {
                carrierArray[i] = 1 * Math.sin(2 * Math.PI * f * t);
            } else if (Type.equals("COSINE")) {
                carrierArray[i] = 1 * Math.cos(2 * Math.PI * f * t);
            }
            t = t + Math.pow(size, -1);

        }
        return carrierArray;

    }

    //GET SAPLES OF THE SQUARE WAVE 
    public int[] sampleSquareWave(int[] basebandSequence, int samplingfrequency) {
        int samplePerBit = samplingfrequency / basebandSequence.length;
        int[] basebandArray = new int[samplingfrequency];
        int[] d = new int[basebandSequence.length + 1];
        for (int c = 0; c <= basebandSequence.length; c++) {
            d[c] = samplePerBit * c;
        }
        for (int w = 0; w <= (basebandSequence.length - 1); w++) {
            for (int a = d[w]; a < (d[w + 1]); a++) {
                basebandArray[a] = basebandSequence[w];
            }
        }
        return basebandArray;
    }

//VALIDATE AND GET BITS ENTERD FOR THE SQUARE WAVE IN THE SPECTRAL ANALYSIS VIEW
    public int[] getBasebandBits(String Bits) {

        int count = Bits.length();
        String[] inputString = new String[count];
        int[] input = new int[count];
        for (int i = 0; i < count; i++) {
            inputString[i] = Bits.substring(i, i + 1);
        }
        for (int i = 0; i < count; i++) {
            try {
                input[i] = Integer.parseInt(inputString[i]);
            } catch (Exception ex) {
                //ErrorMessages("Please Input 1s and 0s only");
                return null;
            }
        }        //Convert zeros to -1
        for (int i = 0; i < count; i++) {
            if (input[i] == 0) {
                input[i] = -1;
            } else if (input[i] == 1) {
                input[i] = 1;
            } else {
                return null;
            }
        }
        return input;
    }

    //GENERATE SPECTRUM USING FFT
    public void generateSpectrum(int frequency, int samplingRate, String Type, int[] input) {
        Model model = Model.getModelObject();
        Controller control = new Controller();

        double[] sampledSignalResult = new double[samplingRate];
        double[] signalFFT = new double[samplingRate];
        if (Type.equals("SINE")) {
            sampledSignalResult = sampleWave(samplingRate, frequency, "SINE");
            signalFFT = control.getFFT(sampledSignalResult);
            plotSignal(getFrequencies(samplingRate / 2), signalFFT, "SINE CARRIER", "SPECTRUM");
            SpectrumAnalyzerView.internalFrame.setContentPane(model.getPlot());
        } else if (Type.equals("COSINE")) {
            sampledSignalResult = sampleWave(samplingRate, frequency, "COSINE");
            signalFFT = control.getFFT(sampledSignalResult);
            plotSignal(getFrequencies(samplingRate / 2), signalFFT, "COSINE CARRIER", "SPECTRUM");
            SpectrumAnalyzerView.internalFrame.setContentPane(model.getPlot());
        } else if (Type.equals("SQUARE")) {
            int[] squareWaveSamples = sampleSquareWave(input, samplingRate);
            double[] doubleSquareWaveSamples = convertIntToDouble(squareWaveSamples);
            signalFFT = control.getFFT(doubleSquareWaveSamples);
            plotSignal(getFrequencies(samplingRate / 2), signalFFT, "SQUARE WAVE CARRIER", "SPECTRUM");
            SpectrumAnalyzerView.internalFrame.setContentPane(model.getPlot());
        }
    }

    //SINCE FFT FUNCTION MAKES USE OF REAL AND IMAGINARY PART,
    //THIS METHOD IS USED TO GENERATE REALS OF ALL 0
    public double[] generateImaginaryBits(int length) {
        double imaginaryBits[] = new double[length];
        for (int i = 0; i < length; i++) {
            imaginaryBits[i] = 0;
        }
        return imaginaryBits;
    }

    //PERFORM ACTUALL FFT BY CALLING THR FFT CLASS
    public double[] getFFT(double[] real) {
        double[] imaginary = generateImaginaryBits(real.length);
        int N = real.length;
        FFT fft = new FFT(N);
        double[] window = fft.getWindow();

        fft.beforeAfter(fft, real, imaginary);

        double abs[] = new double[N];
        for (int i = 0; i < imaginary.length; i++) {
            abs[i] = Math.hypot(real[i], imaginary[i]);
        }
        return abs;

    }

    //GET TIME STEPS THAT WILL BE USED FOR PLOTTING
    public double[] getTimeSteps(int samplingRate) {
        double t[] = new double[samplingRate];
        t[0] = 0;
        for (int i = 1; i < samplingRate; i++) {
            t[i] = t[i - 1] + Math.pow(samplingRate, -1);
        }
        return t;
    }

    //GET TIME STEPS THAT WILL BE USED FOR PLOTTING
    public double[] getFrequencies(int freq) {
        double t[] = new double[freq];
        for (int i = 0; i < freq; i++) {
            t[i] = i;
        }
        return t;
    }

    //QUICK METHOD TO CONVERT INPUT INTO DOUBLE, SO IT CAN BE FED TO THE FFT FUNCTION
    public double[] convertIntToDouble(int[] basebandSamples) {
        double dd[] = new double[basebandSamples.length];
        for (int i = 0; i < basebandSamples.length; i++) {
            dd[i] = (double) basebandSamples[i];
        }
        return dd;
    }

//SIGNAL PLOTING         
    public void plotSignal(double x[], double y[], String type1, String type2) {
        Model model = Model.getModelObject();
        Plot2DPanel plot = new Plot2DPanel();
        plot.addLinePlot("plot", java.awt.Color.BLUE, x, y);
        BaseLabel title = new BaseLabel("THE " + type1 + " " + type2, java.awt.Color.RED, 0.5, 1.1);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        plot.addPlotable(title);

        switch (type2) {
            case "SPECTRUM":
                plot.setAxisLabels("FREQUENCY(hertz)", "MAGNITUDE");
                break;
            case "SIGNAL":
                plot.setAxisLabels("TIME(sec)", "AMPLITUDE");
                break;
        }
        plot.getAxis(0).setLabelPosition(0.5, -0.10);
        plot.getAxis(0).setLabelFont(new Font("Arial", Font.BOLD, 16));
        plot.getAxis(1).setLabelPosition(-0.15, 0.5);
        plot.getAxis(1).setLabelFont(new Font("Arial", Font.BOLD, 16));

        model.setPlot(plot);
    }

}
