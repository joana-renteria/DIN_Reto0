package javalearningapplication.ui;

import java.util.ResourceBundle;
import javalearningapplication.ui.ViewGuiImplementation;
import javalearningapplication.ui.ViewTextImplementation;

/**
 *
 * @author 2dam
 * This class reads the configuration file and creates an implementation based on what
 * the program reads.
 */
public class ViewFactory {
    private static ViewGuiImplementation gui;
    private static ViewTextImplementation text;
    private static View view;
    private static String viewType = 
            ResourceBundle.getBundle("resources.config").getString("VIEWMODE");

    /**
     * 
     * Creates and returns the implementation
     */
    public static View getView() {
        if(viewType.equalsIgnoreCase("Text")){
            view = new ViewTextImplementation();
        }
        else if(viewType.equalsIgnoreCase("View")){
            view = new ViewGuiImplementation();
        }
        return view;
    }

    
}
