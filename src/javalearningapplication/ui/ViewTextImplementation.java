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
public class ViewTextImplementation implements View{
    private String greeting;
    
    public ViewTextImplementation(String greeting){
        this.greeting = greeting;
    } 

    @Override
    public void showGreeting() {
        System.out.println(this.greeting);
    }
    
}
