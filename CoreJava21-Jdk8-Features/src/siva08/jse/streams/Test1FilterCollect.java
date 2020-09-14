package siva08.jse.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1FilterCollect {

	public static void main(String[] args) {

		List<Integer> arrayList1 = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			arrayList1.add(i);
		}
		
		System.out.println(arrayList1);
		
		List<Integer> arrayList2 = arrayList1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(arrayList2);
	}

}
