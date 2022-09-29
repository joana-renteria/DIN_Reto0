package javalearningapplication;

import controller.Controller;
import javalearningapplication.model.Model;
import javalearningapplication.model.ModelFactory;
import javalearningapplication.ui.View;
import javalearningapplication.ui.ViewFactory;

/**
 * 
 * @author 2dam
 * This class launches the  program
 */

public class Application {
            
    private static Controller controller;
    private static View view;
    private static Model model;
    private static ModelFactory modelFactory;
    private static ViewFactory viewFactory;
    
    /**
     * 
     * Gets a model and a view and sends them as perimeters to the run function
     */

    public static void main(String[] args) {
        model = modelFactory.getModel();
        view = viewFactory.getView();
        
        controller = new Controller();
        controller.run(view, model);        
        
    }
    
}
