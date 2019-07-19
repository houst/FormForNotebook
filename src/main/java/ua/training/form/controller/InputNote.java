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
		
		note.setFirstName(inputStringValue(TextConstant.FIRST_NAME, RegexContainer.REGEX_NAME));
		note.setMiddleName(inputStringValue(TextConstant.MIDDLE_NAME, RegexContainer.REGEX_NAME));
		note.setLastName(inputStringValue(TextConstant.LAST_NAME, RegexContainer.REGEX_NAME));
		
		note.setNickname(inputStringValue(TextConstant.NICKNAME, RegexContainer.REGEX_NICKNAME));
		note.setComment(inputStringValue(TextConstant.COMMENT, RegexContainer.REGEX_COMMENT));
		
		note.setHomePhone(inputStringValue(TextConstant.HOME_PHONE, RegexContainer.REGEX_PHONE_NUMBER));
		note.setMobilePhone(inputStringValue(TextConstant.MOBILE_PHONE, RegexContainer.REGEX_PHONE_NUMBER));
		note.setMobilePhoneExtra(inputStringValue(TextConstant.MOBILE_PHONE, RegexContainer.REGEX_PHONE_NUMBER));
		
		note.setEmail(inputStringValue(TextConstant.EMAIL, RegexContainer.REGEX_EMAIL));
		note.setSkype(inputStringValue(TextConstant.SKYPE, RegexContainer.REGEX_SKYPE));
		
		note.setCity(inputStringValue(TextConstant.CITY, RegexContainer.REGEX_NAME));
		note.setHouse(inputStringValue(TextConstant.HOUSE, RegexContainer.REGEX_NUMBER));
		note.setApartment(inputStringValue(TextConstant.APARTMENT, RegexContainer.REGEX_NUMBER));
		note.setZipCode(inputStringValue(TextConstant.ZIP_CODE, RegexContainer.REGEX_NUMBER));
		
		long currentTime = System.currentTimeMillis();
		note.setCreated(new Date(currentTime));
		note.setLastUpdate(new Date(currentTime));
		
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
