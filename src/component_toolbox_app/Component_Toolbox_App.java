//Import package
package component_toolbox_app;

/**
 *
 * @author Oluwole_Jnr
 */
public class Component_Toolbox_App {

    //Load all views into memory at start up
    public static MainFrame mainframe = new MainFrame();
    public static ResistorColourBandView rcbv = new ResistorColourBandView();
    public static ResistorListView rlv = new ResistorListView();
    public static WelcomeView wv = new WelcomeView();
    public static CapacitorColourBandView ccbv = new CapacitorColourBandView();
    public static SpectrumAnalyzerView sav = new SpectrumAnalyzerView();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Model model = Model.getModelObject();
        Controller control = Controller.getControllerObject();
        mainframe.setContentPane(wv); //Insert welcome view into main frame
        mainframe.setVisible(true); //Set mainfame visible
        control.startBlinker(); //Begin thread for logo blinker  
    }

}
