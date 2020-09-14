package siva01.jse.file;

import java.io.File;
import java.io.IOException;

public class Test02Directory {

	public static void main(String[] args) throws IOException {

		File file = new File("SampleDirectory");
		System.out.println(file.exists());
		file.mkdir();
		System.out.println(file.exists());
	}

}
