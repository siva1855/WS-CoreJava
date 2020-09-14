package siva06.jse.methodreference;

public class Test2NonStaticMethod {

	public void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Test2NonStaticMethod test2NonStaticMethod = new Test2NonStaticMethod();
		Runnable runnable = test2NonStaticMethod::m1;
		Thread thread = new Thread(runnable);
		thread.start();

	}

}
