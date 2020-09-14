package siva01.jse.file;

import java.io.File;
import java.io.IOException;

public class Test08OnlyFiles {

	public static void main(String[] args) throws IOException {

		File file1 = new File("D:\\CoreJava");

		String[] filesList = file1.list();
		int count = 0;

		for (String s : filesList) {

			File file2 = new File(file1, s);

			if (file2.isFile()) {
				count++;
				System.out.println(s);
			}
		}
		System.out.println();
		System.out.println("Total File Count :: " + count);
	}

}
