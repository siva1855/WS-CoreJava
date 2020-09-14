package siva08.jse.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2MapCollect {

	public static void main(String[] args) {
		List<String> arrayList1 = new ArrayList<String>();
		arrayList1.add("siva");
		arrayList1.add("kumar");
		arrayList1.add("cherry");
		arrayList1.add("milky");
		arrayList1.add("siva");
		System.out.println(arrayList1);

		List<String> arrayList2 = arrayList1.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(arrayList2);
	}

}
