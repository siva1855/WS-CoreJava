package siva05.jse.instanceofoperator;

interface MyInterface {

}

class Parent {

}

class Child extends Parent implements MyInterface {

}

public class InstanceOperator {

	public static void main(String[] args) {

		Parent parentObject1 = new Parent();
		Parent parentObject2 = new Child();

		System.out.println(parentObject1 instanceof Parent);
		System.out.println(parentObject1 instanceof Child);
		System.out.println(parentObject1 instanceof MyInterface);
		System.out.println();
		System.out.println(parentObject2 instanceof Parent);
		System.out.println(parentObject2 instanceof Child);
		System.out.println(parentObject2 instanceof MyInterface);
	}

}
