package siva08.jse.staticfactorydesign;

public class Triangle implements Shape {

	public Triangle() {
		super();
		System.out.println("Triangle Constructor");
	}

	@Override
	public void showInfo() {
		
		System.out.println("THis is triangle object");
	}

}
