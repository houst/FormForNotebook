package ua.training.form.controller;

import ua.training.form.model.Note;
import ua.training.form.view.ConsoleView;

/**
 * Created by oleglitvinenko on Jul 17, 2019
 */
public class NoteController {
	
	private ConsoleView consoleView;
	private Note note;
	
	public NoteController(ConsoleView consoleView, Note note) {
		this.consoleView = consoleView;
		this.note = note;
	}
	
	public void process() {
		
		InputNote inputNote = new InputNote(consoleView);
		inputNote.fillNote(note);
		
		consoleView.printMessage(new StringBuilder()
				.append(note.getLastName())
				.append(" ")
				.append(note.getFirstName().charAt(0))
				.append(".")
				.toString());
		consoleView.printMessage(new StringBuilder()
				.append(note.getCity())
				.append(" ")
				.append(note.getStreet())
				.append(" ")
				.append(note.getHouse())
				.append(" ")
				.append(note.getApartment())
				.toString());
		consoleView.printMessage(note.getGroup().name());
		consoleView.printMessage(note.getComment());
		
	}
	
}
