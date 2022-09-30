package javalearningapplication.ui;

/**
 * 
 * Implementation of the view interface through graphical user interface
 */

public class ViewTextImplementation implements View{
    private String greeting;
    
    
    public ViewTextImplementation() {
    } 

    /**
     * 
     * Receives a message and prints it
     * to the console
     */
    @Override
    public void showGreeting(String greeting) {
        this.greeting = greeting;
        System.out.println(this.greeting);
    }
    
}
