package siva03.jse.onlineshopping;

public class Item {

	public LineItem lineItem;
	public Product product;
	public CartItem CartItem;
	private double unitCost;

	public Item(LineItem lineItem, Product product, siva03.jse.onlineshopping.CartItem cartItem, double unitCost) {
		super();
		this.lineItem = lineItem;
		this.product = product;
		CartItem = cartItem;
		this.unitCost = unitCost;
	}

	public LineItem getLineItem() {
		return lineItem;
	}

	public void setLineItem(LineItem lineItem) {
		this.lineItem = lineItem;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public CartItem getCartItem() {
		return CartItem;
	}

	public void setCartItem(CartItem cartItem) {
		CartItem = cartItem;
	}

	public double getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(double unitCost) {
		this.unitCost = unitCost;
	}

	@Override
	public String toString() {
		return "Item [lineItem=" + lineItem + ", product=" + product + ", CartItem=" + CartItem + ", unitCost="
				+ unitCost + "]";
	}

	

	

}
