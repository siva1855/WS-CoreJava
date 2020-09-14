package siva03.jse.onlineshopping;

public class LineItem {
	
	public int itemNumber;
	public Item itemId;
	public int quantity;
	public double unitPrice;
	public Order orderId;
	
	public LineItem(int itemNumber, Item itemId, int quantity, double unitPrice, Order orderId) {
		super();
		this.itemNumber = itemNumber;
		this.itemId = itemId;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.orderId = orderId;
	}
	public int getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	public Item getItemId() {
		return itemId;
	}
	public void setItemId(Item itemId) {
		this.itemId = itemId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Order getOrderId() {
		return orderId;
	}
	public void setOrderId(Order orderId) {
		this.orderId = orderId;
	}
	@Override
	public String toString() {
		return "LineItem [itemNumber=" + itemNumber + ", itemId=" + itemId + ", quantity=" + quantity + ", unitPrice="
				+ unitPrice + ", orderId=" + orderId + "]";
	}
		
}
