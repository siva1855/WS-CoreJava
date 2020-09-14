package siva01.jse.lambdaexpression;

@FunctionalInterface
interface ClassVariable {

	public void m1();
}

public class Test6ClassVariable {
//Class Variable
	int value = 555;

	public void m2() {
		
		ClassVariable classVariable = () -> {
			//Local Variable 
			int value = 666;
			System.out.println("Class Variable is :: " + value);
			System.out.println("Local Variable is :: " + this.value);
		};
		classVariable.m1();
	}

	public static void main(String[] args) {
		Test6ClassVariable test6ClassVariable = new Test6ClassVariable();
		test6ClassVariable.m2();
	}

}
