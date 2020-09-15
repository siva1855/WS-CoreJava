package siva01.jse.staticimport;

import static siva01.jse.staticimport.Process.processId;
import static siva01.jse.staticimport.Process.show;

public class Test {

	public static void main(String[] args) {
		System.out.println(processId);
		show();
		show(11);
	}

}
