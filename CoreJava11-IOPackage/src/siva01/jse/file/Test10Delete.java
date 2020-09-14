package siva01.jse.file;

import java.io.File;

public class Test10Delete {

	public static void main(String[] args) {
		
		File file1 = new File("D:\\CoreJava\\WS-CoreJavaPrograms\\CoreJava11-IOStreams\\DemoDir\\DemoFile.pdf");

		System.out.println(file1.delete());
		
	}

}
