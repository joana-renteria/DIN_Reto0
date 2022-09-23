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
    
    private static String readViewArgsFromFile() {
        if(configFile.getString("VIEWMODE").equalsIgnoreCase("Text")){
            view = ViewFactory.getView("text");
        }
        else if(configFile.getString("VIEWMODE").equalsIgnoreCase("View")){
            view = view = ViewFactory.getView("gui");
        }
    }

    private static String readModelArgsFromFile() {
        if(configFile.getString("DATAMODE").equalsIgnoreCase("db")){
            model = ModelFactory.getModel("db");
        }
        else if(configFile.getString("DATAMODE").equalsIgnoreCase("file")){
            model = ModelFactory.getModel("file");
        }
    }

    public static void main(String[] args) {
        if(args.contains("text")) {
            view = ViewFactory.getView("text");
        } else if(args.contains("gui")) {            
            view = ViewFactory.getView("gui");
        } else {
            readViewArgsFromFile();
        }
        
        if(args.contains("db")) {
            model = ModelFactory.getModel("db");
        } else if(args.contains("file")) {            
            model = ModelFactory.getModel("file");
        } else {
            readModelArgsFromFile();
        }
        
        controller = new Controller();
        controller.run(view, model);        
        
    }
    
}
