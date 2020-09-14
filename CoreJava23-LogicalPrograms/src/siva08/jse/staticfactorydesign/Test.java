package siva08.jse.staticfactorydesign;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Choose One option");
		System.out.println("1.Circle");
		System.out.println("2.Square");
		System.out.println("3.Triangle");
		int dimensions = scanner.nextInt();
		if (dimensions > 0 && dimensions < 4) {
			Shape shape = ShapeFactory.getShape(dimensions);
			shape.showInfo();
			shape.shapeMessage();
			Shape.commonMessage();
		} else {
			System.out.println("invalid selection");
		}
		scanner.close();
		
		
	}

}
