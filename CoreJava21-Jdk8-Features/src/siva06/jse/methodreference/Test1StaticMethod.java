package siva06.jse.methodreference;

public class Test1StaticMethod {

	public static void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Runnable runnable = Test1StaticMethod::m1;
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
