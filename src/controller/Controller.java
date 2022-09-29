package controller;

import javalearningapplication.model.Model;
import javalearningapplication.ui.View;

/**
 * 
 * @author 2dam
 * This class mixes the view and the model and executes it
 */

public class Controller {

	public Controller() {
	}
        
        /**
         * Receives a model, gets the message and creates the view that shows
         * the message 
         */
	public void run(View view, Model model) {
		String greeting = model.getGreeting();
		view.showGreeting(greeting);
	}
}
