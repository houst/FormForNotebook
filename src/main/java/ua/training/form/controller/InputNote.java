package ua.training.form.controller;

import static ua.training.form.controller.RegexContainer.*;
import static ua.training.form.view.TextConstant.*;

import java.util.Date;
import java.util.Scanner;

import ua.training.form.model.Note;
import ua.training.form.view.ConsoleView;

/**
 * Created by oleglitvinenko on Jul 18, 2019
 */
public class InputNote {
	
	private ConsoleView consoleView;
	
	public InputNote(ConsoleView consoleView) {
		this.consoleView = consoleView;
	}
	
	public void fillNote(final Note note) {
		
		note.setFirstName(inputStringValueWithScanner(FIRST_NAME, REGEX_NAME));
		note.setMiddleName(inputStringValueWithScanner(MIDDLE_NAME, REGEX_NAME));
		note.setLastName(inputStringValueWithScanner(LAST_NAME, REGEX_NAME));
		
		note.setGroup(inputNoteGroupWithScanner(GROUP, REGEX_NUMBER));
		note.setNickname(inputStringValueWithScanner(NICKNAME, REGEX_NICKNAME));
		note.setComment(inputStringValueWithScanner(COMMENT, REGEX_COMMENT));
		
		note.setHomePhone(inputStringValueWithScanner(HOME_PHONE, REGEX_PHONE_NUMBER));
		note.setMobilePhone(inputStringValueWithScanner(MOBILE_PHONE, REGEX_PHONE_NUMBER));
		note.setMobilePhoneExtra(inputStringValueWithScanner(MOBILE_PHONE, REGEX_PHONE_NUMBER));
		
		note.setEmail(inputStringValueWithScanner(EMAIL, REGEX_EMAIL));
		note.setSkype(inputStringValueWithScanner(SKYPE, REGEX_SKYPE));
		
		note.setCity(inputStringValueWithScanner(CITY, REGEX_NAME));
		note.setHouse(inputStringValueWithScanner(HOUSE, REGEX_NUMBER));
		note.setApartment(inputStringValueWithScanner(APARTMENT, REGEX_NUMBER));
		note.setZipCode(inputStringValueWithScanner(ZIP_CODE, REGEX_NUMBER));
		
		long currentTime = System.currentTimeMillis();
		note.setCreated(new Date(currentTime));
		note.setLastUpdate(new Date(currentTime));
		
	}
	
	private Note.Group inputNoteGroupWithScanner(String fieldName, String regex) {
		
		Note.Group[] groups = Note.Group.values();
		int groupId;
		
		for (int i = 0; i < groups.length; i++) {
			consoleView.printMessage(i + " - " + groups[i]);
		}
		
		while ((groupId = Integer.valueOf(inputStringValueWithScanner(fieldName, regex))) >= groups.length) {
			consoleView.printWrongStringInput(fieldName, regex);
		}
		
		return groups[groupId];
		
	}
	
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
