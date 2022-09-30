/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearningapplication.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
    *
    * test for the model implementation through file
    */
public class ModelDbImplementationTest {
    
    public ModelDbImplementationTest() {
    }

     /**
     * Test method that returns the greeting message
     */
    @Test
    public void testGetGreeting() {
        String message = "Hello world!";
        ModelDbImplementation modelDbImplementation = new ModelDbImplementation();
        assertEquals(message, modelDbImplementation.getGreeting());
    }
    
}
