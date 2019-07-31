package ua.training.form.exception;

import ua.training.form.model.Note;

public class NicknameIsExisted extends Exception {

	private Note note;
	
	public NicknameIsExisted(String message, Note note) {
		super(message);
		this.note = note;
	}
	
	public Note getNote() {
		return note;
	}
	
}
