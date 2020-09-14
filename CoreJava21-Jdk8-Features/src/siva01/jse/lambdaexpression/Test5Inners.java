package siva01.jse.lambdaexpression;

public class Test5Inners {

	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			for (int value = 0; value <= 5; value++) {
				System.out.println("Inner Thread values are :: " + value);
			}
		});
		thread.start();
		/*
		 * for (int value = 0; value <= 5; value++) {
		 * System.out.println("Outer Thread values are :: " + value); }
		 */
	}
}
