package javalearningapplication.ui;

public class ViewTextImplementation implements View{
    private String greeting;
    
    public ViewTextImplementation() {
    } 

    @Override
    public void showGreeting(String greeting) {
        this.greeting = greeting;
        System.out.println(this.greeting);
    }
    
}
