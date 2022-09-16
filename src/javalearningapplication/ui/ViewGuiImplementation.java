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
public class ViewGuiImplementation implements View{
    private String greeting;
    
    public ViewGuiImplementation(String greeting){
           this.greeting = greeting;
    }

    @Override
    public void showGreeting() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
