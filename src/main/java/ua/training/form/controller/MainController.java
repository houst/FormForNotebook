package ua.training.form.controller;

import ua.training.form.exception.NicknameIsExisted;
import ua.training.form.model.Note;
import ua.training.form.view.ConsoleView;

/**
 * Created by oleglitvinenko on Jul 17, 2019
 */
public class MainController {
	
	private ConsoleView consoleView;
	private Note note;
	
	public MainController(ConsoleView consoleView, Note note) {
		this.consoleView = consoleView;
		this.note = note;
	}
	
	public void process() {
		
		NoteController noteController = new NoteController(consoleView);
		noteController.fillNote(note);
		
		try {
			noteController.addNote(note);
		} catch (NicknameIsExisted e) {
			e.printStackTrace();
		}
		consoleView.printMessage(new StringBuilder()
				.append(note.getLastName())
				.append(' ')
				.append(note.getFirstName().charAt(0))
				.append('.')
				.toString());
		consoleView.printMessage(new StringBuilder()
				.append(note.getCity())
				.append(' ')
				.append(note.getStreet())
				.append(' ')
				.append(note.getHouse())
				.append(' ')
				.append(note.getApartment())
				.toString());
		consoleView.printMessage(note.getGroup().name());
		consoleView.printMessage(note.getComment());
		consoleView.printMessage(note.getLastUpdate().toString());
		
	}
	
}
