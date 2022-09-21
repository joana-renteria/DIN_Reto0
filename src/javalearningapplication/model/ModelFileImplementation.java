package javalearningapplication.model;

import java.util.ResourceBundle;

public class ModelFileImplementation implements Model {
    private ResourceBundle messageFile = ResourceBundle.getBundle("message.properties");
    @Override
    public String getGreeting() {
        return messageFile.getString("MESSAGE");
    }
    
}
