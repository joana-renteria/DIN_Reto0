package javalearningapplication.model;

import java.util.ResourceBundle;
import javalearningapplication.ui.ViewFactory;

/**
 *
 * This class reads the file and creates an implementation based on what
 * the program reads on the properties file.
 */
public class ModelFactory {
    private static String typeFile = 
            ResourceBundle.getBundle("resources.config").getString("DATAMODE");
    private static Model model;

    /**
     * 
     * Creates and returns the implementation
     * @returns the Model from the selected implementation
     */
    public static Model getModel() {
        
        if(typeFile.equalsIgnoreCase("db")){
            model = new ModelDbImplementation();
        }
        else if(typeFile.equalsIgnoreCase("file")){
            model = new ModelFileImplementation();
        }
    return model;
    }
    
    
}
