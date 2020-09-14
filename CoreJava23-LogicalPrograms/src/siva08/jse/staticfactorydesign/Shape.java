package siva08.jse.staticfactorydesign;

public interface Shape {

	public void showInfo();

	public default void shapeMessage() {
		System.out.println("Welcome to ShapeFactory");
	}

	public static void commonMessage() {
		System.out.println("Comman Message Hello Shape..");
	}
}
