package siva07.jse.reflectionapi;

public class Product implements Model {

	public Product() {
		super();
		System.out.println("Product Constructor");
	}

	@Override
	public String getModelName() {

		return "Product";
	}

	@Override
	public Model getModelObject() {

		return this;
	}

	@Override
	public String toString() {
		return "From Product Object";
	}

}
