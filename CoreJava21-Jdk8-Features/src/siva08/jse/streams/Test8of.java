package siva08.jse.streams;

import java.util.stream.Stream;

public class Test8of {

	public static void main(String[] args) {
		String[] fruits = { "apple", "banana", "mango", "grapes" };
		Stream<String> streamObj = Stream.of(fruits);
		streamObj.forEach(System.out::println);

	}

}
