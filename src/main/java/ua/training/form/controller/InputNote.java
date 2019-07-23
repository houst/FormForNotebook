package ua.training.form.controller;

import java.util.Date;
import java.util.Scanner;

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
		
		note.setFirstName(inputStringValueWithScanner(TextConstant.FIRST_NAME, RegexContainer.REGEX_NAME));
		note.setMiddleName(inputStringValueWithScanner(TextConstant.MIDDLE_NAME, RegexContainer.REGEX_NAME));
		note.setLastName(inputStringValueWithScanner(TextConstant.LAST_NAME, RegexContainer.REGEX_NAME));
		
		note.setNickname(inputStringValueWithScanner(TextConstant.NICKNAME, RegexContainer.REGEX_NICKNAME));
		note.setComment(inputStringValueWithScanner(TextConstant.COMMENT, RegexContainer.REGEX_COMMENT));
		
		note.setHomePhone(inputStringValueWithScanner(TextConstant.HOME_PHONE, RegexContainer.REGEX_PHONE_NUMBER));
		note.setMobilePhone(inputStringValueWithScanner(TextConstant.MOBILE_PHONE, RegexContainer.REGEX_PHONE_NUMBER));
		note.setMobilePhoneExtra(inputStringValueWithScanner(TextConstant.MOBILE_PHONE, RegexContainer.REGEX_PHONE_NUMBER));
		
		note.setEmail(inputStringValueWithScanner(TextConstant.EMAIL, RegexContainer.REGEX_EMAIL));
		note.setSkype(inputStringValueWithScanner(TextConstant.SKYPE, RegexContainer.REGEX_SKYPE));
		
		note.setCity(inputStringValueWithScanner(TextConstant.CITY, RegexContainer.REGEX_NAME));
		note.setHouse(inputStringValueWithScanner(TextConstant.HOUSE, RegexContainer.REGEX_NUMBER));
		note.setApartment(inputStringValueWithScanner(TextConstant.APARTMENT, RegexContainer.REGEX_NUMBER));
		note.setZipCode(inputStringValueWithScanner(TextConstant.ZIP_CODE, RegexContainer.REGEX_NUMBER));
		
		long currentTime = System.currentTimeMillis();
		note.setCreated(new Date(currentTime));
		note.setLastUpdate(new Date(currentTime));
		
	}
	
	private String inputStringValueWithScanner(String fieldName, String regex) {
		
		Scanner sc = ScannerSingleton.getInstance().getScanner();
		
		consoleView.printStringInput(fieldName, regex);
		String inputStr = sc.nextLine();
		
		while( ! inputStr.matches(regex)) {
			consoleView.printWrongStringInput(fieldName, regex);
			inputStr = sc.nextLine();
		}
		
		return inputStr;
	}
	
}
