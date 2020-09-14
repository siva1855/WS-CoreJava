package siva08.jse.streams;

import java.util.ArrayList;
import java.util.List;

public class Test6ForEach {

	public static void main(String[] args) {

		List<String> items = new ArrayList<>();
		items.add("Apple");
		items.add("banana");
		items.add("Cherries");
		items.add("Dates");
		items.add("Elderberry");

		// lambda
		items.forEach(item -> System.out.println(item));
		System.out.println();
		
		items.forEach(item -> {
			if ("Cherries".equals(item)) {
				System.out.println(item);
			}
		});
		System.out.println();
		
		// method reference
		items.forEach(System.out::println);
		System.out.println();
		
		// Stream and filter
		items.stream().filter(s -> s.contains("b")).forEach(System.out::println);
		System.out.println();

		items.stream().forEach(System.out::println);

	}
}
