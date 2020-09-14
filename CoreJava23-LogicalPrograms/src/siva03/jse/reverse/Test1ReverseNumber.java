package siva03.jse.reverse;

public class Test1ReverseNumber {

	public static void main(String[] args) {

		int value = 8142;
		//to convert int to value
		String numberToStringConvert = String.valueOf(value);

		String reverseString = "";
		for (int i = numberToStringConvert.length() - 1; i >= 0; i--) {
			reverseString = reverseString + numberToStringConvert.charAt(i);
		}
		//to convert String to int
		System.out.println(Integer.valueOf(reverseString));
	}
}
