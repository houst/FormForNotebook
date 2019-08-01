package ua.training.form.entity;

public enum Notes {
	Object1(
			new Note(
					null, 
					null, 
					null, 
					null, 
					"nicknameExample", 
					null, 
					null, 
					null, 
					null, 
					null, 
					null, 
					null, 
					null, 
					null, 
					null, 
					null, 
					null, 
					null));
	
	private Note note;
	
	private Notes(final Note note) {
		this.note = note;
	}
	
	public Note getNote() {
		return note;
	}
	
}
