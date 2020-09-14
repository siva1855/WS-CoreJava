package siva01.jse.lambdaexpression;

@FunctionalInterface
interface LocalVariable {

	public void m1();
}

public class Test7LocalVariable {

	int value1 = 551;

	public void m2() {
		int value2 = 661;

		LocalVariable localVariable = () -> {
			int value3 = 777;
			System.out.println("Class Variable is :: " + value1);
			System.out.println("Local Variable is :: " + value2);
			System.out.println("inside lambda Exp is:: " + value3);
			value1 = 552;
			// value2=662; CE
			System.out.println("Class Variable is :: " + value1);
		};
		localVariable.m1();
	}

	public static void main(String[] args) {
		Test7LocalVariable test7LocalVariable = new Test7LocalVariable();
		test7LocalVariable.m2();
	}

}
