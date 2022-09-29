/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearningapplication.ui;

import java.util.ResourceBundle;
import javalearningapplication.ui.ViewGuiImplementation;
import javalearningapplication.ui.ViewTextImplementation;

/**
 *
 * @author 2dam
 */
public class ViewFactory {
    private static ViewGuiImplementation gui;
    private static ViewTextImplementation text;
    private static View view;
    private static String viewType = 
            ResourceBundle.getBundle("resources.config").getString("VIEWMODE");

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
