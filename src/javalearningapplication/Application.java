package javalearningapplication;

import controller.Controller;
import javalearningapplication.model.Model;
import javalearningapplication.model.ModelFactory;
import javalearningapplication.ui.View;
import javalearningapplication.ui.ViewFactory;

public class Application {
    private Controller controller;
    private static View view;
    private static Model model;

    public static void main(String[] args) {
        switch(args[1]){
            case "text":
                view = ViewFactory.getView("text");
                break;
                
            case "gui":
                view = ViewFactory.getView("gui");
                break;
                
            default:
                break;
        }
        
        switch(args[2]){
            case "db":
                model = ModelFactory.getModel("db");
                break;
                
            case "file":
                model = ModelFactory.getModel("file");
                break;
        }
        
        controller = new Controller();
        controller.run();        
        
    }
    
}
