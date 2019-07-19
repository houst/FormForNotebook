package ua.training.form.controller;

import java.util.Date;

import ua.training.form.model.Note;
import ua.training.form.view.ConsoleView;
import ua.training.form.view.TextConstant;

/**
 * Created by oleglitvinenko on Jul 18, 2019
 */
public class InputNote {
	
	private ConsoleView consoleView;
	
	public InputNote(ConsoleView consoleView) {
		this.consoleView = consoleView;
	}
	
	public void fillNote(Note note) {
		final Note newNote = new Note();
		
		newNote.setFirstName(inputStringValue(TextConstant.FIRST_NAME, RegexContainer.REGEX_NAME));
		newNote.setMiddleName(inputStringValue(TextConstant.MIDDLE_NAME, RegexContainer.REGEX_NAME));
		newNote.setLastName(inputStringValue(TextConstant.LAST_NAME, RegexContainer.REGEX_NAME));
		
		newNote.setNickname(inputStringValue(TextConstant.NICKNAME, RegexContainer.REGEX_NICKNAME));
		newNote.setComment(inputStringValue(TextConstant.COMMENT, RegexContainer.REGEX_COMMENT));
		
		newNote.setHomePhone(inputStringValue(TextConstant.HOME_PHONE, RegexContainer.REGEX_PHONE_NUMBER));
		newNote.setMobilePhone(inputStringValue(TextConstant.MOBILE_PHONE, RegexContainer.REGEX_PHONE_NUMBER));
		newNote.setMobilePhoneExtra(inputStringValue(TextConstant.MOBILE_PHONE, RegexContainer.REGEX_PHONE_NUMBER));
		
		newNote.setEmail(inputStringValue(TextConstant.EMAIL, RegexContainer.REGEX_EMAIL));
		newNote.setSkype(inputStringValue(TextConstant.SKYPE, RegexContainer.REGEX_SKYPE));
		
		newNote.setCity(inputStringValue(TextConstant.CITY, RegexContainer.REGEX_NAME));
		newNote.setHouse(inputStringValue(TextConstant.HOUSE, RegexContainer.REGEX_NUMBER));
		newNote.setApartment(inputStringValue(TextConstant.APARTMENT, RegexContainer.REGEX_NUMBER));
		newNote.setZipCode(inputStringValue(TextConstant.ZIP_CODE, RegexContainer.REGEX_NUMBER));
		
		long currentTime = System.currentTimeMillis();
		newNote.setCreated(new Date(currentTime));
		newNote.setLastUpdate(new Date(currentTime));
		
	}
	
	private String inputStringValue(String fieldName, String regex) {
		
		consoleView.printStringInput(fieldName, regex);
		String inputStr = ScannerUtil.inputStringValueWithScanner();
		
		while( ! inputStr.matches(regex)) {
			consoleView.printWrongStringInput(fieldName, regex);
			inputStr = ScannerUtil.inputStringValueWithScanner();
		}
		
		return inputStr;
	}
	
}
