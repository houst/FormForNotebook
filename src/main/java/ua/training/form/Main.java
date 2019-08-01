package ua.training.form;

import ua.training.form.controller.MainController;
import ua.training.form.entity.Note;
import ua.training.form.view.ConsoleView;

/**
 * Created by oleglitvinenko on Jul 17, 2019 
 */
public class Main {
	
	public static void main(String... args) {
		new MainController(new ConsoleView(), new Note()).process();
	}
	
}
