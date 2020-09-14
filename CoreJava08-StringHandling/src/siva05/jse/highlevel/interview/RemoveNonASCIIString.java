package siva05.jse.highlevel.interview;

public class RemoveNonASCIIString {

	public static void main(String[] args) {
		String stringName = "Instance¡of¥java";
		System.out.println(stringName);
		stringName = stringName.replaceAll("[^\\p{ASCII}]", "");
		System.out.println("After removing non ASCII chars: ");
		System.out.println(stringName);

	}

}
