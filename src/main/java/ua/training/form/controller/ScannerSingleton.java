package ua.training.form.controller;

import java.util.Scanner;

/**
 * Created by oleglitvinenko on Jul 17, 2019
 */
public class ScannerSingleton {
	
	private final Scanner sc = new Scanner(System.in);
	
	private ScannerSingleton() {}
	
	public static ScannerSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
	
	public Scanner getScanner() {
		return sc;
	}
	
	private static class SingletonHelper {
		private static final ScannerSingleton INSTANCE = new ScannerSingleton();
	}
	
}
