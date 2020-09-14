package siva09.jse.ternary;

public class TernaryOperator {

	public static void main(String[] args) {

		System.out.println((10 < 20) ? 2 : 1); // true
		System.out.println((10 > 20) ? 9 : 6); // flase
		System.out.println((10 < 5) ? 2 : (5 > 9) ? 4 : (9 > 7) ? 3 : 1);// false false true

	}
}
