package siva03.jse.elseifstatement;

public class Test01 {

	public static void main(String[] args) {
		int value = -10;
		if (value > 0) {
			System.out.println("Positive Number");
		} else if (value < 0) {
			System.out.println("Nagative Number");
		} else if (value == 0) {
			System.out.println("-10 is equal to 0 ");
		} else {
			System.out.println("Zero");
		}
	}
}
