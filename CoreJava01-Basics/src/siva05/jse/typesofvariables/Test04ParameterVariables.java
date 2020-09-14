package siva05.jse.typesofvariables;

public class Test04ParameterVariables {
	// m1(String name) is Parameter Variable
	public void m1(String name) {
		System.out.println(name);
	}

	public String m2(String address) {
		String addr = "My Location :: " + address;
		System.out.println(addr);
		return addr;
	}

	public static void m3(int value) {
		System.out.println(value);
	}

	public static void main(String[] args) {

		Test04ParameterVariables parameterVariables = new Test04ParameterVariables();
		parameterVariables.m1("Sivakumar");
		parameterVariables.m2("Pinnelli");
		Test04ParameterVariables.m3(10);
	}

}
