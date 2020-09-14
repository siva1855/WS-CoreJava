package siva03.jse.onlineshopping;

public class Cart {
	public CartItem cartItem;
	public int addItem;
	public int removeItem;

	public Cart(CartItem cartItem, int addItem, int removeItem) {
		super();
		this.cartItem = cartItem;
		this.addItem = addItem;
		this.removeItem = removeItem;
	}

	public CartItem getCartItem() {
		return cartItem;
	}

	public void setCartItem(CartItem cartItem) {
		this.cartItem = cartItem;
	}

	public int getAddItem() {
		return addItem;
	}

	public void setAddItem(int addItem) {
		this.addItem = addItem;
	}

	public int getRemoveItem() {
		return removeItem;
	}

	public void setRemoveItem(int removeItem) {
		this.removeItem = removeItem;
	}

	@Override
	public String toString() {
		return "Cart [cartItem=" + cartItem + ", addItem=" + addItem + ", removeItem=" + removeItem + "]";
	}

}
