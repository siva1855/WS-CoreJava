package siva04.jse.datatypes;

class Demo {

}

public class Test01DataTypes {
	
	//primitive DataTypes
	byte b = 10;           
	short s = 10;
	int i = 10;
	long l = 123456789l;
	float f = 123.456f;
	double d = 12345.789123d;
	char c = 'M';
	boolean bo = false;
	
	//Class dataTypes
	String str = "sivakumar";   
	Demo demo;

	public static void main(String[] args) {
		Test01DataTypes dataTypes = new Test01DataTypes();
		System.out.println(dataTypes.b + "\n" + dataTypes.s + "\n" + dataTypes.i + "\n" + dataTypes.l + "\n"
				+ dataTypes.f + "\n" + dataTypes.d + "\n" + dataTypes.c + "\n" + dataTypes.bo + "\n" + dataTypes.str
				+ "\n" + dataTypes.demo);
	}
}
