package siva06.jse.singleton;

public class SingletonClassObject implements Cloneable {

	private static SingletonClassObject singletonClassObject;

	private SingletonClassObject() {
		super();
	}
	public static SingletonClassObject getFactoryMethod() {
		if (singletonClassObject == null) {
			synchronized (SingletonClassObject.class) {
				if (singletonClassObject == null) {
					singletonClassObject = new SingletonClassObject();
				}
			}
		}
		return singletonClassObject;
	}
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
}
