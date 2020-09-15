package siva01.jse.staticimport;

public class Process {

	public static int processId=1855;
	public static String processName="Deploy Production";
	public String processCode="Production123";
	public double processCost=90000;
	
	public static void show() {
		System.out.println("No Parameters Method");
	}
	public static void show(int processId) {
		System.out.println("One Parameter Method");
	}
	public void find() {
		System.out.println("Default...");
	}
}
