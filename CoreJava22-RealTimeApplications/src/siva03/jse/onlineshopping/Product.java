package siva03.jse.onlineshopping;

public class Product {
	
	public int productId;
	public String name;
	public String description;
	public Category category;
	
	
	public Product(int productId, String name, String description, Category category) {
		super();
		this.productId = productId;
		this.name = name;
		this.description = description;
		this.category = category;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", description=" + description + ", category="
				+ category + "]";
	}
	
}
