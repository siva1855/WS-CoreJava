package siva07.jse.reflectionapi;

public class Test {

	public static void main(String[] args) throws Exception {
		Class c = Class.forName(args[0]);
		
		Object obj = c.newInstance();
		if (obj instanceof Model) {
			Model model = (Model) obj;
			System.out.println(model.getModelName());
			System.out.println(model.getModelObject());
		}
	}

}
