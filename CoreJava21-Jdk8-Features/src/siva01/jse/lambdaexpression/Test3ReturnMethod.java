package siva01.jse.lambdaexpression;

@FunctionalInterface
interface ReturnMethod {

	public int square(int value);
}

public class Test3ReturnMethod {

	public static void main(String[] args) {
		ReturnMethod returnMethod = (value) -> {
			return value * value;
		};
		System.out.println("The value of square is :: " + returnMethod.square(5));
	}
}
