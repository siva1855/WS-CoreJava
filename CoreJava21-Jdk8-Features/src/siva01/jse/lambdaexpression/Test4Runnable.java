package siva01.jse.lambdaexpression;

public class Test4Runnable {

	public static void main(String[] args) {
		Runnable runnable = () -> {
			for (int value = 0; value <= 5; value++) {
				System.out.println("Child Thread values are :: " + value);
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		/*
		 * for (int value = 0; value <= 5; value++) {
		 * System.out.println("Main Thread values are :: " + value); }
		 */
	}

}
