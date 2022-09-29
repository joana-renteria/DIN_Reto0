
package javalearningapplication.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2dam
 * test for the model implementation through file
 */
public class ModelFileImplementationTest {
    
    public ModelFileImplementationTest() {
    }
    
    /**
     * Test method that returns the greeting message
     */
    @Test
    public void testGetGreeting() {
        String message = "HELLO WORLD";
        ModelFileImplementation modelFileImplementation = new ModelFileImplementation();
        assertEquals(message, modelFileImplementation.getGreeting());
    }
    
}
