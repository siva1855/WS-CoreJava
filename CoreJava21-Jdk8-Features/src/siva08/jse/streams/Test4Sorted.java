package siva08.jse.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test4Sorted {

	public static void main(String[] args) {
		List<String> arrayList1 = new ArrayList<String>();
		arrayList1.add("siva");
		arrayList1.add("kumar");
		arrayList1.add("cherry");
		arrayList1.add("milky");
		arrayList1.add("annapurna");
		System.out.println(arrayList1);

		List<String> arrayList2 = arrayList1.stream().sorted().collect(Collectors.toList());
		System.out.println("default sorting order :: " + arrayList2);

		List<String> arrayList3 = arrayList1.stream().sorted((s1, s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("Customizes sorting order :: " + arrayList3);

	}

}
