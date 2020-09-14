package siva03.jse.staticmethods;

interface NotOverride {

	public static void m1() {
		System.out.println("interface static method");
	}
}

public class Test2NotOverride implements NotOverride {
	
	public static void m1() {
		System.out.println("Trest2NotOverride static method");
	}

	public static void main(String[] args) {
		Test2NotOverride.m1();
		NotOverride.m1();
	}

}
