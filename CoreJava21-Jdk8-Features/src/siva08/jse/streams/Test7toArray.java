package siva08.jse.streams;

import java.util.ArrayList;
import java.util.List;

public class Test7toArray {

	public static void main(String[] args) {

		List<Integer> arrayList1 = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			arrayList1.add(i);
		}
		System.out.println(arrayList1);

		Integer[] arrayValues = arrayList1.stream().toArray(Integer[]::new);

		for (Integer values : arrayValues) {
			System.out.println(values);
		}

	}

}
