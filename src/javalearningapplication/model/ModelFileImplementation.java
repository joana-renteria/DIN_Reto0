package javalearningapplication.model;

import java.util.ResourceBundle;

/**
 * 
 * @author 2dam
 * Implementation of the model interface
 */

public class ModelFileImplementation implements Model {
    private ResourceBundle messageFile = ResourceBundle.getBundle("resources.message");
    
    /**
     * 
     * Reads the file and returns the String labeled as "MESSAGE" 
     */
    
    @Override
    public String getGreeting() {
        return messageFile.getString("MESSAGE");
    }
    
}
