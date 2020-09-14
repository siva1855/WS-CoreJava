package siva14.jse.breakstatement;

public class BreakForLoop {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		 System.out.println("Loop complete.");
	}

}
