package siva05.jse.typesofvariables;

public class Test01LocalVariavles {
	public void m1() {
		int x = 10; // Local Variable
		System.out.println(x);
	}

	public static void m2() {
		int y = 20; // Local Variable
		System.out.println(y);
	}

	public static void main(String[] args) {
		Test01LocalVariavles localVariables = new Test01LocalVariavles();
		localVariables.m1();
		Test01LocalVariavles.m2();
	}
}
