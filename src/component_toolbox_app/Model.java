/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//load in necessary packages and classes
package component_toolbox_app;

import javafx.scene.paint.Color;
import org.math.plot.Plot2DPanel;

/**
 *
 * @author Oluwole_Jnr
 */
public class Model {

    //Declaration of all the needed variables
    public static Model model;
    private int currentBand;
    String OHMS = "\u2126";
    private String[] imageList = {"RTB_Logo_EC0.jpg", "RTB_Logo_EC1.jpg", "RTB_Logo_EC4.jpg"};
    private String[] tantalumStringColourList = {"NONE", "BLACK", "BROWN", "RED", "ORANGE", "YELLOW", "GREEN", "BLUE", "VIOLET", "GREY", "WHITE", "PINK"};
    private final Color[] tantalumColourList = {Color.BLACK, Color.BROWN, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.GREEN, Color.BLUE, Color.VIOLET, Color.GREY, Color.WHITE, Color.PINK};
    private final Color[] resistorColourList = {Color.BLACK, Color.BROWN, Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.VIOLET, Color.GRAY, Color.WHITE, Color.GOLD, Color.SILVER}; //IVORY IS USED TO REPRESENT WHITE COLOUR, FOR VISIBILITY SAKE
    private Color resistorBand1Colour = Color.IVORY, resistorBand2Colour = Color.IVORY, resistorBand3Colour = Color.IVORY, resistorBand4Colour = Color.IVORY, resistorBand5Colour = Color.IVORY, resistorBand6Colour = Color.IVORY;
    private Color tantalumBand1Colour = Color.IVORY, tantalumBand2Colour = Color.IVORY, tantalumBand3Colour = Color.IVORY, tantalumBand4Colour = Color.IVORY;
    private boolean stopBlinking;
    private boolean fiveBands = true;
    private String currentResistanceResult = "NA";
    private String currentCapacitanceResult = "NA";
    private String[] seriesList = {"E24", "E12", "E6", "E3"};
    private String currentResistorSeries, currentResistorValue, currentResistorOrderNumber, currentResistorPrice;
    private int capacitorViewInitFlag = 1;
    private Plot2DPanel plot = new Plot2DPanel();

    private Model() {

    }

    //From here and below are the various getters and setters for all the 
    //declared variables
    public Plot2DPanel getPlot() {
        return plot;
    }

    public void setPlot(Plot2DPanel plot) {
        this.plot = plot;
    }

    public String getCurrentCapacitanceResult() {
        return currentCapacitanceResult;
    }

    public void setCurrentCapacitanceResult(String currentCapacitanceResult) {
        this.currentCapacitanceResult = currentCapacitanceResult;
    }

    public int getCapacitorViewInitFlag() {
        return capacitorViewInitFlag;
    }

    public void setCapacitorViewInitFlag(int capacitorViewInitFlag) {
        this.capacitorViewInitFlag = capacitorViewInitFlag;
    }

    public Color getResistorBand1Colour() {
        return resistorBand1Colour;
    }

    public void setResistorBand1Colour(Color resistorBand1Colour) {
        this.resistorBand1Colour = resistorBand1Colour;
    }

    public Color getResistorBand2Colour() {
        return resistorBand2Colour;
    }

    public void setResistorBand2Colour(Color resistorBand2Colour) {
        this.resistorBand2Colour = resistorBand2Colour;
    }

    public Color getResistorBand3Colour() {
        return resistorBand3Colour;
    }

    public void setResistorBand3Colour(Color resistorBand3Colour) {
        this.resistorBand3Colour = resistorBand3Colour;
    }

    public Color getResistorBand4Colour() {
        return resistorBand4Colour;
    }

    public void setResistorBand4Colour(Color resistorBand4Colour) {
        this.resistorBand4Colour = resistorBand4Colour;
    }

    public Color getResistorBand5Colour() {
        return resistorBand5Colour;
    }

    public void setResistorBand5Colour(Color resistorBand5Colour) {
        this.resistorBand5Colour = resistorBand5Colour;
    }

    public Color getResistorBand6Colour() {
        return resistorBand6Colour;
    }

    public void setResistorBand6Colour(Color resistorBand6Colour) {
        this.resistorBand6Colour = resistorBand6Colour;
    }

    public Color getTantalumBand1Colour() {
        return tantalumBand1Colour;
    }

    public void setTantalumBand1Colour(Color tantalumBand1Colour) {
        this.tantalumBand1Colour = tantalumBand1Colour;
    }

    public Color getTantalumBand2Colour() {
        return tantalumBand2Colour;
    }

    public void setTantalumBand2Colour(Color tantalumBand2Colour) {
        this.tantalumBand2Colour = tantalumBand2Colour;
    }

    public Color getTantalumBand3Colour() {
        return tantalumBand3Colour;
    }

    public void setTantalumBand3Colour(Color tantalumBand3Colour) {
        this.tantalumBand3Colour = tantalumBand3Colour;
    }

    public Color getTantalumBand4Colour() {
        return tantalumBand4Colour;
    }

    public void setTantalumBand4Colour(Color tantalumBand4Colour) {
        this.tantalumBand4Colour = tantalumBand4Colour;
    }

    public String[] getTantalumStringColourList() {
        return tantalumStringColourList;
    }

    public void setTantalumStringColourList(String[] tantalumStringColourList) {
        this.tantalumStringColourList = tantalumStringColourList;
    }

    public String getCurrentResistorSeries() {
        return currentResistorSeries;
    }

    public void setCurrentResistorSeries(String currentResistorSeries) {
        this.currentResistorSeries = currentResistorSeries;
    }

    public String getCurrentResistorValue() {
        return currentResistorValue;
    }

    public void setCurrentResistorValue(String currentResistorValue) {
        this.currentResistorValue = currentResistorValue;
    }

    public String getCurrentResistorOrderNumber() {
        return currentResistorOrderNumber;
    }

    public void setCurrentResistorOrderNumber(String currentResistorOrderNumber) {
        this.currentResistorOrderNumber = currentResistorOrderNumber;
    }

    public String getCurrentResistorPrice() {
        return currentResistorPrice;
    }

    public void setCurrentResistorPrice(String currentResistorPrice) {
        this.currentResistorPrice = currentResistorPrice;
    }

    public String[] getSeriesList() {
        return seriesList;
    }

    public void setSeriesList(String[] seriesList) {
        this.seriesList = seriesList;
    }

    public String[] getE24List() {
        return e24List;
    }

    public void setE24List(String[] e24List) {
        this.e24List = e24List;
    }

    public String[] getE12List() {
        return e12List;
    }

    public void setE12List(String[] e12List) {
        this.e12List = e12List;
    }

    public String[] getE6List() {
        return e6List;
    }

    public void setE6List(String[] e6List) {
        this.e6List = e6List;
    }

    public String[] getE3List() {
        return e3List;
    }

    public void setE3List(String[] e3List) {
        this.e3List = e3List;
    }
    private String[] e24List = {"10", "11", "12", "13", "15", "16", "18", "20", "22", "24", "27", "30", "33", "36", "39", "43", "47", "51", "56", "62", "68", "75", "82", "91"};
    private String[] e12List = {"10", "12", "15", "18", "22", "27", "33", "39", "47", "56", "68", "82"};
    private String[] e6List = {"10", "15", "22", "33", "47", "68"};
    private String[] e3List = {"10", "22", "47"};

    public String[] getImageList() {
        return this.imageList;
    }

    public void setBlinkCommand(boolean command) {
        this.stopBlinking = command;
    }

    public boolean getBlinkCommand() {
        return this.stopBlinking;
    }

    public void setFiveBands(boolean command) {
        this.fiveBands = command;
    }

    public boolean getFiveBands() {
        return this.fiveBands;
    }

    public String getCurrentResistanceResult() {
        return currentResistanceResult;
    }

    public void setCurrentResistanceResult(String currentResistanceResult) {
        this.currentResistanceResult = currentResistanceResult;
    }

    public int getCurrentBand() {
        return this.currentBand;
    }

    public void setCurrentBand(int currentband) {
        this.currentBand = currentband;
    }

    public Color[] getColourList() {
        return this.resistorColourList;
    }

    public Color getColourFromList(int index) {
        return this.resistorColourList[index];
    }

    public static Model getModelObject() {
        if (model == null) {
            model = new Model();
        }
        return model;
    }

}
