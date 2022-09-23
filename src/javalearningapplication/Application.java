package javalearningapplication;

import controller.Controller;
import javalearningapplication.model.Model;
import javalearningapplication.model.ModelFactory;
import javalearningapplication.ui.View;
import javalearningapplication.ui.ViewFactory;

public class Application {
            
    private static Controller controller;
    private static View view;
    private static Model model;
    private static ModelFactory modelFactory;
    private static ViewFactory viewFactory;

    public static void main(String[] args) {
        model = modelFactory.getModel();
        view = viewFactory.getView();
        
        controller = new Controller();
        controller.run(view, model);        
        
    }
    
}
