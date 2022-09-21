package javalearningapplication;

import controller.Controller;
import java.util.ResourceBundle;
import javalearningapplication.model.Model;
import javalearningapplication.model.ModelFactory;
import javalearningapplication.ui.View;
import javalearningapplication.ui.ViewFactory;

public class Application {
    private static ResourceBundle configFile = 
            ResourceBundle.getBundle("javalearningapplication.config");
            
    private static Controller controller;
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
                if(configFile.getString("VIEWMODE").equalsIgnoreCase("Text")){
                    view = ViewFactory.getView("text");
                }
                else if(configFile.getString("VIEWMODE").equalsIgnoreCase("View")){
                    view = view = ViewFactory.getView("gui");
                }
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
        controller.run(view, model);        
        
    }
    
}
