package siva01.jse.file;

import java.io.File;
import java.io.IOException;

public class Test04Constructor2 {

	public static void main(String[] args) throws IOException {

		File file1 = new File("DemoDir");
		file1.mkdir();
		File file2 = new File(file1, "DemoFile.pdf");
		//File file2 = new File("DemoDir", "DemoFile.pdf");
		file2.createNewFile();

	}

}
