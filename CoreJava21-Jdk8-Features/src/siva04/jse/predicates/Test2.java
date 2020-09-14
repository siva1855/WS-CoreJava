package siva04.jse.predicates;

import java.util.function.Predicate;

public class Test2 {

	public static void main(String[] args) {
		
		Predicate<String> predicate = name -> (name.length() > 5);
		System.out.println(predicate.test("milky"));
		System.out.println(predicate.test("sivakumar"));

	}

}
