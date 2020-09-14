package siva16.jse.returnstatement;

import java.util.ArrayList;
import java.util.List;

public class Return4 {
	List<String> m1() {
		List<String> list = new ArrayList<String>();
		list.add("APPLE");
		list.add("BANANA");
		list.add("CARROT");
		list.add("DRAGAN FRUIT");
		list.add("EGGS");
		return list;
	}

	public static void main(String[] args) {
		Return4 return4 = new Return4();
		System.out.println(return4.m1());
	}

}
