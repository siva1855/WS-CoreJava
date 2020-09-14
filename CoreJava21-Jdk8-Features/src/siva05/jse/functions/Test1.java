package siva05.jse.functions;

import java.util.Scanner;
import java.util.function.Function;

public class Test1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name :: ");

		String value = scanner.nextLine();
		Function<String, Integer> function = name -> name.length();
		System.out.println(function.apply(value));

	}

}
