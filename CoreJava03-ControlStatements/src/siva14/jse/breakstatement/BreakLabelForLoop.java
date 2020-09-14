package siva14.jse.breakstatement;

public class BreakLabelForLoop {

	public static void main(String[] args) {
		condition1:
			for (int i = 1; i <= 3; i++) {
			condition2:
				for (int j = 1; j <= 3; j++) {
				if (i == 2 && j == 2) {
					break condition1;

				}
				System.out.println(i + " " + j);
			}
		}

	}

}
