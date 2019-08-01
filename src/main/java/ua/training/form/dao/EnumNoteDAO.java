package ua.training.form.dao;

import java.util.ArrayList;
import java.util.List;

import ua.training.form.entity.Note;
import ua.training.form.entity.Notes;

public class EnumNoteDAO implements INoteDao {
	
	public List<Note> getAllNotes() {
		List<Note> notes = new ArrayList<>();
		
		for (Notes eNote : Notes.values()) {
			notes.add(eNote.getNote());
		}
		
		return notes; 
	}
	
	public void addNote(final Note note) throws Exception {
		// TODO: Hardcode
		throw new Exception();
	}
	
}
