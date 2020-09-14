package siva03.jse.onlineshopping;

public class Order  {
	
	public Account account;
	public String billingAddress;
	public String shippingAddress;
	public double totalPrice;
	
	public Order(Account account, String billingAddress, String shippingAddress, double totalPrice) {
		super();
		this.account = account;
		this.billingAddress = billingAddress;
		this.shippingAddress = shippingAddress;
		this.totalPrice = totalPrice;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public String getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return "Order [account=" + account + ", billingAddress=" + billingAddress + ", shippingAddress="
				+ shippingAddress + ", totalPrice=" + totalPrice + "]";
	}
		
}
	
	