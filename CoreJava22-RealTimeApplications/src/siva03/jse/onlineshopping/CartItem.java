package siva03.jse.onlineshopping;

public class CartItem  {
	
	public String Items;
	public int quantity;
	public String inStock;
	public double getTotalPrice;
	
	public CartItem(String items, int quantity, String inStock, double getTotalPrice) {
		super();
		Items = items;
		this.quantity = quantity;
		this.inStock = inStock;
		this.getTotalPrice = getTotalPrice;
	}
	public String getItems() {
		return Items;
	}
	public void setItems(String items) {
		Items = items;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getInStock() {
		return inStock;
	}
	public void setInStock(String inStock) {
		this.inStock = inStock;
	}
	public double getGetTotalPrice() {
		return getTotalPrice;
	}
	public void setGetTotalPrice(double getTotalPrice) {
		this.getTotalPrice = getTotalPrice;
	}
	@Override
	public String toString() {
		return "CartItem [Items=" + Items + ", quantity=" + quantity + ", inStock=" + inStock + ", getTotalPrice="
				+ getTotalPrice + "]";
	}
	
	
}
