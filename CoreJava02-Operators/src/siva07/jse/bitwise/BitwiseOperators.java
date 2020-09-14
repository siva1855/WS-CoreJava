package siva07.jse.bitwise;

public class BitwiseOperators {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		int z = 30;
		
		System.out.println("...........AND...............");
		System.out.println(x < y & x > y); // true&false=flase
		System.out.println(y < z & y > z); // true&flase=false
		System.out.println(z < x & x > z); // false&false=false
		
		System.out.println(".........OR.....................");
		System.out.println(x < y | x > y); // true&false=true
		System.out.println(y < z | y > z); // true&flase=true
		System.out.println(z < x | x > z); // false&false=false
		
		System.out.println("............NOT...................");
		System.out.println(x < y ^ x > y); // true&false=flase
		System.out.println(y < z ^ y > z); // true&flase=false
		System.out.println(z < x ^ x > z); // false&false=false
	}

}
