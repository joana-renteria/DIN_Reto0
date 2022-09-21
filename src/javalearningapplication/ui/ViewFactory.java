/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearningapplication.ui;

/**
 *
 * @author 2dam
 */
public class ViewFactory {
    private static ViewGuiImplementation gui;
    private static ViewTextImplementation text;

    public static View getView(String mode) {
        switch(mode){
            case "gui":
                
                break;
            case "text":
                break;
        }
        return null;
    }

    
}
