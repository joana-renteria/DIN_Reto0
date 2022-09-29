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
 * @author minyb
 */
public class ModelFileImplementationTest {
    
    public ModelFileImplementationTest() {
    }
    
    @Test
    public void testGetGreeting() {
        String message = "HELLO WORLD";
        ModelFileImplementation modelFileImplementation = new ModelFileImplementation();
        assertEquals(message, modelFileImplementation.getGreeting());
    }
    
}
