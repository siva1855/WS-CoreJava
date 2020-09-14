package siva02.jse.defaultmethods;

interface One {

	default void m1() {
		System.out.println("...default Method Call");
	}
}

public class Test1 implements One {

	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.m1();

	}

}
