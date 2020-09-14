package siva03.jse.reverse;

public class Test2ReverseString {

	public static void main(String[] args) {

		String name = "siva";
		String reverse = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
		}
		System.out.println(reverse);
	}
}
