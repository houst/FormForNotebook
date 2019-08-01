package ua.training.form.entity;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {
	
	private String name;
	
	private List<Note> notes = new ArrayList<>();
	
	public NoteBook(String name, List<Note> notes) {
		super();
		this.name = name;
		this.notes = notes;
	}
	
	public void addNote(Note note) {
		notes.add(note);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}
	
}
