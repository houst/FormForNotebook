package ua.training.form.controller;

import static ua.training.form.util.RegexContainer.*;
import static ua.training.form.view.TextConstant.*;

import java.util.Date;
import java.util.Scanner;

import ua.training.form.entity.Note;
import ua.training.form.exception.NicknameIsExisted;
import ua.training.form.service.NoteService;
import ua.training.form.util.ScannerSingleton;
import ua.training.form.view.ConsoleView;

/**
 * Created by oleglitvinenko on Jul 18, 2019
 */
public class NoteController {
	
	private NoteService noteService;
	private ConsoleView consoleView;
	
	public NoteController(ConsoleView consoleView) {
		this.consoleView = consoleView;
		this.noteService = new NoteService();
	}
	
	public void addNote(final Note note) throws NicknameIsExisted {
		noteService.addNote(note);
	}
	
	/**
	 * Filling form
	 * @param note
	 */
	public void fillNote(final Note note) {
		
		note.setFirstName(inputStringValueWithScanner(FIRST_NAME, REGEX_NAME));
		note.setMiddleName(inputStringValueWithScanner(MIDDLE_NAME, REGEX_NAME));
		note.setLastName(inputStringValueWithScanner(LAST_NAME, REGEX_NAME));
		
		note.setGroup(inputNoteGroupWithScanner());
		note.setNickname(inputStringValueWithScanner(NICKNAME, REGEX_NICKNAME));
		note.setComment(inputStringValueWithScanner(COMMENT, REGEX_COMMENT));
		
		note.setHomePhone(inputStringValueWithScanner(HOME_PHONE, REGEX_PHONE_NUMBER));
		note.setMobilePhone(inputStringValueWithScanner(MOBILE_PHONE, REGEX_PHONE_NUMBER));
		note.setMobilePhoneExtra(inputStringValueWithScanner(MOBILE_PHONE_EXTRA, REGEX_PHONE_NUMBER));
		
		note.setEmail(inputStringValueWithScanner(EMAIL, REGEX_EMAIL));
		note.setSkype(inputStringValueWithScanner(SKYPE, REGEX_SKYPE));
		
		note.setCity(inputStringValueWithScanner(CITY, REGEX_NAME));
		note.setStreet(inputStringValueWithScanner(STREET, REGEX_NAME));
		note.setHouse(inputStringValueWithScanner(HOUSE, REGEX_NUMBER));
		note.setApartment(inputStringValueWithScanner(APARTMENT, REGEX_NUMBER));
		note.setZipCode(inputStringValueWithScanner(ZIP_CODE, REGEX_NUMBER));
		
		long currentTime = System.currentTimeMillis();
		note.setCreated(new Date(currentTime));
		note.setLastUpdate(new Date(currentTime));
		
	}
	
	/**
	 * This method gives user information about groups and then gets his choice
	 * @return
	 */
	private Note.Group inputNoteGroupWithScanner() {
		
		Note.Group[] groups = Note.Group.values();
		int groupId;
		
		for (int i = 0; i < groups.length; i++) {
			consoleView.printMessage(i + " - " + groups[i]);
		}
		
		while ((groupId = Integer.valueOf(inputStringValueWithScanner(GROUP, REGEX_NUMBER))) >= groups.length) {
			consoleView.printWrongStringInput(GROUP, REGEX_NUMBER);
		}
		
		return groups[groupId];
		
	}
	
	/**
	 * This method needed to get information from user filling form
	 * @param fieldName name of field which user fills with keyboard
	 * @param regex regular expression with help one executes checking of input value
	 * @return value entered by user
	 */
	private String inputStringValueWithScanner(String fieldName, String regex) {
		
		Scanner sc = ScannerSingleton.getInstance().getScanner();
		String inputStr;
		
		consoleView.printStringInput(fieldName, regex);
		while ( !(inputStr = sc.nextLine()).matches(regex) ) {
			consoleView.printWrongStringInput(fieldName, regex);
		}
		
		return inputStr;
	}
	
}
