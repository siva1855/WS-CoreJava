package siva03.jse.staticmethods;

interface One {

	public static void sum(int value1, int value2) {
		System.out.println("The Sum of :" + (value1 + value2));
	}
}

public class Test1 implements One {
	public static void main(String[] args) {
		One.sum(5, 6);
	}

}
