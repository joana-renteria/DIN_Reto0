package controller;

import javalearningapplication.model.Model;
import javalearningapplication.ui.View;

public class Controller {

	public Controller() {
	}

	public void run(View view, Model model) {
            System.out.println(model.getGreeting());
		String greeting = model.getGreeting();
		view.showGreeting(greeting);
	}
}
