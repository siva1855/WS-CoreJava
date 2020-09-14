package siva08.jse.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class Product {

	Integer productId;
	String productName;
	Double productCost;

	public Product(Integer productId, String productName, Double productCost) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
	}

}

public class Test9Product {

	public static void main(String[] args) {

		List<Product> productList1 = new ArrayList<>();
		productList1.add(new Product(1, "Lenovo-laptop", 50000d));
		productList1.add(new Product(2, "Dell-laptop", 30000d));
		productList1.add(new Product(3, "HP-laptop", 40000d));
		productList1.add(new Product(4, "Ace-laptop", 10000d));
		productList1.add(new Product(5, "MI-laptop", 20000d));

		List<Double> productList2 = productList1.stream()
				.filter(product -> product.productCost >= 30000)
				.map(product -> product.productCost)
				.collect(Collectors.toList());

		System.out.println(productList2);
	}

}
