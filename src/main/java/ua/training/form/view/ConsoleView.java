package ua.training.form.view;

import static ua.training.form.view.TextConstant.COLON;
import static ua.training.form.view.TextConstant.INPUT_STRING_DATA;
import static ua.training.form.view.TextConstant.REGEX;
import static ua.training.form.view.TextConstant.WRONG_INPUT_DATA;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by oleglitvinenko on Jul 18, 2019
 */
public class ConsoleView {
	
	public static final ResourceBundle bundle = 
			ResourceBundle.getBundle(
					"messages",
//					new Locale("ua", "UA"));
					new Locale("en"));
	
	public void printMessage(String message) {
		System.out.println(message);
	}
	
	
	public void printStringInput(String fieldName, String regex) {
        printMessage(concatenateStrings(
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(fieldName),
                bundle.getString(REGEX),
                regex,
                bundle.getString(COLON)));
    }
	
	public void printWrongStringInput(String fieldName, String regex) {
        printMessage(concatenateStrings(
        		bundle.getString(WRONG_INPUT_DATA),
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(fieldName),
                bundle.getString(REGEX),
                regex,
                bundle.getString(COLON)));
    }
	
	private String concatenateStrings(String...args) {
		StringBuilder concatStr = new StringBuilder();
		for(String str : args) {
			concatStr.append(str);
		}
		return concatStr.toString();
	}
	
}
