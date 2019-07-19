package ua.training.form;

import ua.training.form.controller.NoteController;
import ua.training.form.model.Note;
import ua.training.form.view.ConsoleView;

/**
 * Created by oleglitvinenko on Jul 17, 2019
 */
public class Main {
	
	public static void main(String... args) {
		new NoteController(new ConsoleView(), new Note()).process();
	}
	
}
