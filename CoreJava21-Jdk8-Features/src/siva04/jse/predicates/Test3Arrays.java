package siva04.jse.predicates;

import java.util.function.Predicate;

public class Test3Arrays {

	public static void main(String[] args) {

		String[] fruitsArray = { "apple", "mango", "banana", "watermillon", "avocados", "apricots", "blueberries" };

		Predicate<String> predicate = fruitNames -> fruitNames.charAt(0) == 'a';
		System.out.println("the String starts with a : ");
		for (String fruits : fruitsArray) {
			if (predicate.test(fruits)) {
				System.out.println(fruits);
			}
		}

	}

}
