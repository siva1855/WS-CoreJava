package siva03.jse.onlineshopping;

public class MainAppTest {

	private static final CartItem CartItem = null;
	private static final siva03.jse.onlineshopping.CartItem cartItem = null;
	private static final siva03.jse.onlineshopping.LineItem lineItem = null;

	public static void main(String[] args) {

		Category category = new Category(1, "mobile", "samsung 4G Mobile");
		System.out.println(category);
		System.out.println();

		Product product = new Product(101, "laptop", "lenovo v110 i3 process", category);
		System.out.println(product);
		System.out.println();

		CartItem cartItem = new CartItem("shoe", 2, "Avaliable", 3000);
		System.out.println(cartItem);
		System.out.println();

		Cart cart = new Cart(cartItem, 1, 2);
		System.out.println(cart);
		System.out.println();

		Account account = new Account("siva", "siva@gmail.com", "muluguri", "sivakumar");
		System.out.println(account);
		System.out.println();

		Order order = new Order(account, "hyd", "gnt", 5000);
		System.out.println(order);
		System.out.println();

		Item item = new Item(lineItem, product, cartItem, 2300);
		System.out.println(item);
		System.out.println();

		LineItem lineItem = new LineItem(101, item, 5, 1500, order);
		System.out.println(lineItem);

	}

}
