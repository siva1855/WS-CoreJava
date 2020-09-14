package siva08.jse.logical;

public class LogicalOROperator {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 30;

		System.out.println(x < y || x > y || y < z); // T||F||T
		System.out.println(y < z || z > y || y < x); // T||T||F
		System.out.println(z < x || x > z || z < y); // F||F||F
	}

}
