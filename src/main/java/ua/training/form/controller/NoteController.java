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
		
		
		
	}
	
}
