package siva07.jse.constructorreference;

class Sample {
	private String name;

	Sample(String name) {
		this.name = name;
		System.out.println("Constructor Executed : " + name);
	}
}

interface Example {
	public Sample get(String name);
}

public class Test1 {

	public static void main(String[] args) {

		Example example2 = Sample::new;
		example2.get("from Constructor Reference");
	}

}
