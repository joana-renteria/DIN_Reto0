package javalearningapplication.ui;

/**
 * 
 * @author 2dam
 * Implementation of the view interface through graphical user interface
 */

public class ViewTextImplementation implements View{
    private String greeting;
    
    
    public ViewTextImplementation() {
    } 

    /**
     * 
     * Receives a message and prints it
     */
    @Override
    public void showGreeting(String greeting) {
        this.greeting = greeting;
        System.out.println(this.greeting);
    }
    
}
