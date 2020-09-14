package siva11.jse.stringjoin;

import java.util.ArrayList;
import java.util.List;

public class Test01StringJoin {

	public static void main(String[] args) {
		String stringValues = String.join(" ", "My", "Name", "Is", "Sivakumar");
		System.out.println(stringValues);

		List<String> StringList = new ArrayList<String>();
		StringList.add("My");
		StringList.add("Name");
		StringList.add("Is");
		StringList.add("Sivakumar");

		String listValues = String.join(" ", StringList);
		System.out.println(listValues);
	}

}
