package siva05.jse.typesofvariables;

public class Test02NonStaticVariables {
	int x = 10; // non-static variable (OR) Class level Variable

	public void m1() {
		System.out.println(x);
	}

	public static void m2() {
		// System.out.println(x);
	}

	public static void main(String[] args) {
		
		Test02NonStaticVariables nonStaticVariables = new Test02NonStaticVariables();
		nonStaticVariables.m1();
	}

}
