package siva05.jse.typesofvariables;

public class Test03StaticVariables {
	static String name = "Sivakumar"; // static variable

	public void m1() {
		// static String x="10";
		System.out.println(name);
	}

	public static void m2() {
		// static String y="20";
		System.out.println(name);
	}

	public static void main(String[] args) {
		
		Test03StaticVariables staticLevelVariable = new Test03StaticVariables();
		staticLevelVariable.m1();
		Test03StaticVariables.m2();
	}

}
