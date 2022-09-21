package controller;

public class Controller {

	public Controller() {
	}

	public void run(View view, Model model) {
		String greeting = model.getGreeting();
		view.showGreeting(greeting);
	}

}
