package siva02.jse.swapping;

public class Test1Swapping {

	public static void main(String[] args) {
		
		int x=10;
		int y=20;
		System.out.println("Before swap ..... x== "+x);
		System.out.println("Before swap .... .y== "+y);
		
		System.out.println("---------------------------------------------");
		
		//Using (+,_)
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After swap ..... x== "+x);
		System.out.println("After swap .... .y== "+y);
		
	}

}
