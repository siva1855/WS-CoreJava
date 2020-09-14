package siva08.jse.streams;

import java.util.ArrayList;
import java.util.List;

public class Test3Count {

	public static void main(String[] args) {
		List<String> arrayList1 = new ArrayList<String>();
		arrayList1.add("siva");
		arrayList1.add("kumar");
		arrayList1.add("cherry");
		arrayList1.add("milky");
		arrayList1.add("siva");
		System.out.println(arrayList1);

		Long count = arrayList1.stream().filter(s -> s.length() >= 5).count();

		System.out.println("The number of 5 length string is :: " + count);

	}

}
