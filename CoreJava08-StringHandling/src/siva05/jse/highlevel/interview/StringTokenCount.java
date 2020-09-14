package siva05.jse.highlevel.interview;

import java.util.StringTokenizer;

public class StringTokenCount {

	public static void main(String[] args) {
		String sentence = "this is hello from siva";
		StringTokenizer stringTokenizer = new StringTokenizer(sentence);
		System.out.println("Count: " + stringTokenizer.countTokens());
	}

}
