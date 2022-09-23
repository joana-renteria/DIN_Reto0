package javalearningapplication.model;

import java.util.ResourceBundle;

public class ModelFileImplementation implements Model {
    private ResourceBundle messageFile = ResourceBundle.getBundle("resources.message");
    @Override
    public String getGreeting() {
        return messageFile.getString("MESSAGE");
    }
    
}
