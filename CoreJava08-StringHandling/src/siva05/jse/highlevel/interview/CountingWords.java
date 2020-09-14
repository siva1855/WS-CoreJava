package siva05.jse.highlevel.interview;

import java.util.Scanner;

public class CountingWords {

	public static void main(String[] args) {
		System.out.println("Enter The String");
		Scanner scanner = new Scanner(System.in);
		String enterSentence = scanner.nextLine();
		String[] countWords = enterSentence.trim().split(" ");
		System.out.println("Number of words in the sentence =" + countWords.length);
	}

}
