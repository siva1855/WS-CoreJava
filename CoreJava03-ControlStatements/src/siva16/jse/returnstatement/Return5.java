package siva16.jse.returnstatement;

public class Return5 {

	static int add(int value1, int value2) {
		int result;
		result = value1 + value2;
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Return5.add(10, 20));
	}

}
