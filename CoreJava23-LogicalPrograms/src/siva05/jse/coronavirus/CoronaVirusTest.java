package siva05.jse.coronavirus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoronaVirusTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Patient Symptoms");
		String value = scanner.nextLine();
		String[] diseases = value.split(" ");
		boolean isTrue = false;

		List<String> diseaseList = new ArrayList<String>();
		diseaseList.add("Fever");
		diseaseList.add("Cough");
		diseaseList.add("Tiredness");
		diseaseList.add("Headache");

		for (int i = 0; i < diseases.length; i++) {
			if (diseaseList.contains(diseases[i])) {
				isTrue = true;
			} else {
				isTrue = false;
			}
		}

		if (isTrue) {
			System.out.println("The patient need to go for Corona Test");
		} else {
			System.out.println("The Patient doesnot have Corona");
		}
	}

}
