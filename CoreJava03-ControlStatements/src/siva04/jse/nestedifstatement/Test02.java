package siva04.jse.nestedifstatement;

public class Test02 {

	public static void main(String[] args) {
		int age = 20;
		int weight = 50;

		if (age >= 18) {
			
			if (weight > 60) {
				System.out.println("You are Healthy Person & eligible to donate Blood");
			} else {
				System.out.println("You are Not Healthy Person");
			}
			
		} else {
			System.out.println("You are age is not suffient");
		}

	}
}
