package siva08.jse.labeledforloopstatement;

public class LabeledForLoop2 {

	public static void main(String[] args) {
	
		label1:
			for(int i=0;i<=5;i++) {
				label2:
					for(int j=0;j<=5;j++) {
						System.out.println(i+"  "+j);
						break label2;
					}
			}

	}

}
