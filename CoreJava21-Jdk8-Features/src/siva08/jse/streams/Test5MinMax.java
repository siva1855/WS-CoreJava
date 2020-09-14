package siva08.jse.streams;

import java.util.ArrayList;
import java.util.List;

public class Test5MinMax {

	public static void main(String[] args) {

		List<Integer> arrayList1 = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			arrayList1.add(i);
		}
		System.out.println(arrayList1);

		int minValue1 = arrayList1.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("min values :: " + minValue1);

		int maxValue1 = arrayList1.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("max values :: " + maxValue1);

		List<String> arrayList2 = new ArrayList<String>();
		arrayList2.add("siva");
		arrayList2.add("kumar");
		arrayList2.add("cherry");
		arrayList2.add("milky");
		arrayList2.add("annapurna");
		System.out.println(arrayList2);

		String minValue2 = arrayList2.stream().min((s1, s2) -> s1.compareTo(s2)).get();
		System.out.println("min values :: " + minValue2);

		String maxValue2 = arrayList2.stream().max((s1, s2) -> s1.compareTo(s2)).get();
		System.out.println("max values :: " + maxValue2);
	}

}
