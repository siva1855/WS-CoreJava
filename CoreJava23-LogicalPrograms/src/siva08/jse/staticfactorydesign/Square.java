package siva08.jse.staticfactorydesign;

public class Square implements Shape {

	public Square() {
		super();
		System.out.println("Square Constructor......");
	}

	@Override
	public void showInfo() {
		System.out.println("This is Square Shape ");

	}
	public void shapeMessage() {
		System.out.println("Message from Square");
	}

}
