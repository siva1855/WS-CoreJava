package siva01.jse.lambdaexpression;

@FunctionalInterface
interface One {

	public abstract void m1();
	int x=10;
}

public class Test1 {

	public static void main(String[] args) {
		One one = () -> {
			System.out.println("hello");
		};
		one.m1();
	
	}

}
