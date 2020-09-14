package siva04.jse.predicates;

import java.util.function.Predicate;

public class Test5Joining {

	static int[] values = { 0, 5, 15, 15, 20, 22, 25, 30, 35 };

	public static void m1(Predicate<Integer> predicate, int[] values) {

		for (int printValues : values) {
			if (predicate.test(printValues)) {
				System.out.println(printValues);
			}
		}
	}

	public static void main(String[] args) {

		Predicate<Integer> predicate1 = x -> x > 10;
		Predicate<Integer> predicate2 = x -> x % 2 == 0;

		System.out.println("The number greater than 10 :: ");
		m1(predicate1, values);
		System.out.println();
		System.out.println("The even numbers are :");
		m1(predicate2, values);
		System.out.println();

		System.out.println("The numbers NOT greater than 10 :");
		m1(predicate1.negate(), values);
		System.out.println();

		System.out.println("The numbers greater than 10 AND The even numbers are ");
		m1(predicate1.and(predicate2), values);
		System.out.println();

		System.out.println("The numbers greater than 10 OR The even numbers are ");
		m1(predicate1.or(predicate2), values);

			}

}
