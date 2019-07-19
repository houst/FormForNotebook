package ua.training.form.controller;

import java.util.Scanner;

/**
 * Created by oleglitvinenko on Jul 17, 2019
 */
public abstract class ScannerUtil {
	
	private static final Scanner SC;
	
	static {
		SC = new Scanner(System.in);
	}
	
	public static String inputStringValueWithScanner() {
		return SC.nextLine();
	}
	
}
