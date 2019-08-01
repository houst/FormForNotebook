package ua.training.form.dao;

import java.util.List;

import ua.training.form.entity.Note;

public interface INoteDao {
	
	public List<Note> getAllNotes();
	
	public void addNote(Note note) throws Exception;
	
}
