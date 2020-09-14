package siva05.jse.highlevel.interview;

import java.util.StringTokenizer;

public class TokensWithDelimiter {

	public static void main(String[] args) {
		String url = "http://10.123.43.67:80/";
		StringTokenizer stringTokenizer = new StringTokenizer(url, "://.", true);
		String message = "";
		while (stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());
		}
		System.out.println("Replaced String is " + message.replaceAll("[://./]", " "));
		
	}

}
