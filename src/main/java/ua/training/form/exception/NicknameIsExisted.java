package ua.training.form.exception;

import ua.training.form.entity.Note;

public class NicknameIsExisted extends Exception {

	private static final long serialVersionUID = 6800573692554840879L;
	private Note note;
	
	public NicknameIsExisted(String message, Note note) {
		super(message);
		this.note = note;
	}
	
	public Note getNote() {
		return note;
	}
	
}
