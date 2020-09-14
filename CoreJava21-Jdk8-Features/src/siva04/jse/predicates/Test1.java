package siva04.jse.predicates;

import java.util.function.Predicate;

public class Test1 {

	public static void main(String[] args) {
		
		Predicate<Integer> predicate=I->(I>10);
		System.out.println(predicate.test(9));
		System.out.println(predicate.test(54));

	}

}
