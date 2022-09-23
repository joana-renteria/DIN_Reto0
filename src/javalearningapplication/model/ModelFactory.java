/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearningapplication.model;

import java.util.ResourceBundle;
import javalearningapplication.ui.ViewFactory;

/**
 *
 * @author 2dam
 */
public class ModelFactory {
    private static String typeFile = 
            ResourceBundle.getBundle("resources.config").getString("DATAMODE");
    private static Model model;

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
