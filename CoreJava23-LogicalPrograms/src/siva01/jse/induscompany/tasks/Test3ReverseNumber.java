package siva01.jse.induscompany.tasks;

public class Test3ReverseNumber {
	
	public static void main(String args[]) {
		
		int num = 1990;
		int reversenum = 0;
		
		while (num != 0) {
			reversenum = reversenum * 10;
			reversenum = reversenum + num % 10;
			num = num / 10;
		}

		System.out.println(reversenum);
	}
}
