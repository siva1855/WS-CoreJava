package siva02.jse.defaultmethods;

interface Two {

	default void m1() {
		System.out.println("Default Method Call");
	}
}

public class Test2Override implements Two {

	@Override
	public void m1() {
		Two.super.m1();
	}

	public static void main(String[] args) {

		Test2Override test2Override = new Test2Override();
		test2Override.m1();

	}

}
