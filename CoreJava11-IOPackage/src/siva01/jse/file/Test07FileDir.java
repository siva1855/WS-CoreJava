package siva01.jse.file;

import java.io.File;
import java.io.IOException;

public class Test07FileDir {

	public static void main(String[] args) throws IOException {

		File file = new File("D:\\CoreJava");
		
		String[] filesList = file.list();
		int count = 0;
		
		for (String s : filesList) {
			count++;
			System.out.println(s);
		}
		System.out.println();
		System.out.println("Total File Count :: " + count);
	}

}
