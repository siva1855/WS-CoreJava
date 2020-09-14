package siva01.jse.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test8CollectionsCompare {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(50);
		list.add(40);
		System.out.println("not sorted " + list);
		Comparator<Integer> comparator = (x, y) -> (x < y) ? -1 : (x > y) ? 1 : 0;
		Collections.sort(list, comparator);
		System.out.println("sorted " + list);
	}

}
