package siva08.jse.staticfactorydesign;

public class ShapeFactory {

	public static Shape getShape(int dimensions) {
		String dimensionsString = choose(dimensions);
		Shape shape = null;
		try {
			Object obj = Class.forName(dimensionsString).newInstance();
			if (obj instanceof Shape) {
				shape = (Shape) obj;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return shape;
	}

	private static String choose(int dimensions) {
		String dimensionsString = null;
		switch (dimensions) {
		case 1:
			dimensionsString = "siva08.jse.staticfactorydesign.Circle";
			break;
		case 2:
			dimensionsString = "siva08.jse.staticfactorydesign.Square";
			break;
		case 3:
			dimensionsString = "siva08.jse.staticfactorydesign.Triangle";
			break;
		default:
			break;
		}
		return dimensionsString;

	}
}
