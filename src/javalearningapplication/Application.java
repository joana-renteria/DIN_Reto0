/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearningapplication;

import controller.Controller;
import javalearningapplication.model.Model;
import javalearningapplication.model.ModelFactory;
import javalearningapplication.ui.View;
import javalearningapplication.ui.ViewFactory;

/**
 *
 * @author 2dam
 */
public class Application {
    private Controller controller;
    private static View view;
    private static Model model;

    /**
     * @param args the command line arguments
     */
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
    }
    
}
