package siva05.jse.highlevel.interview;

import java.util.Scanner;

public class SortStringWithoutAPI {
	
	public static void main(String[] args) {

		System.out.println("Enter any String");
		Scanner scanner = new Scanner(System.in);
		String original = scanner.next();
		
		char tempararyChars = 0;
		char[] totalChars = original.toCharArray();
		for (int i = 0; i < totalChars.length; i++) {
			for (int j = 0; j < totalChars.length; j++) {
				if (totalChars[j] > totalChars[i]) {
					tempararyChars = totalChars[i];
					totalChars[i] = totalChars[j];
					totalChars[j] = tempararyChars;
				}
			}
		}
		String sorted = new String(totalChars);
		System.out.println(sorted);
	}

}
