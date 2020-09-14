package siva08.jse.labeledforloopstatement;

public class LabeledForLoop1 {

	public static void main(String[] args) {
         //outer for loop
		label1: for (int i = 0; i <= 5; i++) {
			// inner for loop
			label2: for (int j = 0; j <= 5; j++) {
				System.out.println(i + " " + j);
				break label1;
			}
		}

	}

}
