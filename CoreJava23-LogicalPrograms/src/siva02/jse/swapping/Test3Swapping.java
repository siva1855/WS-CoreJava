package siva02.jse.swapping;

public class Test3Swapping {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		int temararyValue=0;
		System.out.println("Before swap ..... x== " + x);
		System.out.println("Before swap .... .y== " + y);
		System.out.println("---------------------------------------------");
		
		//Using  temarary variable 
		
		temararyValue=x;
		x=y;
		y=temararyValue;
		
		System.out.println("After swap ..... x== " + x);
		System.out.println("After swap .... .y== " + y);


	}

}
