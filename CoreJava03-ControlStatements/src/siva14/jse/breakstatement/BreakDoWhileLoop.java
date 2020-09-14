package siva14.jse.breakstatement;

public class BreakDoWhileLoop {

	public static void main(String[] args) {
		int i = 0;
		do {
			if (i == 5) {
				i++;
				break;
			}
			System.out.println(i);
			i++;
		} while (i <= 10);

	}

}
