package siva01.jse.file;

import java.io.File;
import java.io.IOException;

public class Test05 {

	public static void main(String[] args) throws IOException {

		File file = new File("D:\\CoreJava", "sampleFile.txt");
		file.createNewFile();
	}

}
