package siva05.jse.highlevel.interview;

import java.util.StringTokenizer;

public class RemoveSpaces {

	public static void main(String[] args) {
		String stringName = "Instance   of  java   ";
		StringTokenizer stringTokenizer = new StringTokenizer(stringName, " ");
		StringBuffer stringBuffer = new StringBuffer();
		while (stringTokenizer.hasMoreElements()) {
			stringBuffer.append(stringTokenizer.nextElement()).append(" ");
		}
		System.out.println(stringBuffer.toString().trim());
	}

}
