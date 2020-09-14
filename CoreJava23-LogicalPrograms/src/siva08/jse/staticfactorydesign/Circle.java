package siva08.jse.staticfactorydesign;

public class Circle implements Shape {

	public Circle() {
		super();
		System.out.println("Circle Constructor...");
	}

	@Override
	public void showInfo() {
		System.out.println("This is a circle Object");

	}

	public void shapeMessage() {
		System.out.println("Message from circle");
	}
}
