package siva05.jse.highlevel.interview;

import java.util.Arrays;
import java.util.Scanner;

public class SortStringWithAPI {

	public static void main(String[] args) {
		
		System.out.println("Enter any String");
		Scanner scanner = new Scanner(System.in);
		String original = scanner.next();
		
		char[] totalChars=original.toCharArray();
		Arrays.sort(totalChars);
		String sorted = new String(totalChars);
		System.out.println(sorted);

	}

}
