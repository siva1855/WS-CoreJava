package siva01.jse.lambdaexpression;

@FunctionalInterface
interface Addition {

	public void add(int value1, int value2);
}

public class Test2Addition {

	public static void main(String[] args) {

		Addition addition = (int value1, int value2) -> {
			
			System.out.println("the Sum of value is :: " + (value1 + value2));
		};
		addition.add(5, 5);
	}

}
