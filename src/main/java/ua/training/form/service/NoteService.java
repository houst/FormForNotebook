package ua.training.form.service;

import ua.training.form.dao.EnumNoteDAO;
import ua.training.form.entity.Note;
import ua.training.form.exception.NicknameIsExisted;

public class NoteService {
	
	private EnumNoteDAO enumNoteDAO;
	
	public NoteService() {
		enumNoteDAO = new EnumNoteDAO();
	}
	
	public void addNote(final Note note) throws NicknameIsExisted {
		try {
			enumNoteDAO.addNote(note);
		} catch (Exception e) {
			throw new NicknameIsExisted("Sorry but your entered nickname is existed", note);
		}
	}

}
