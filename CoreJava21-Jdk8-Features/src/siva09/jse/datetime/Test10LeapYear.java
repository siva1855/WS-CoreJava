package siva09.jse.datetime;

import java.time.Year;
import java.util.Scanner;

public class Test10LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Year :: ");

		int value = scanner.nextInt();
		Year year = Year.of(value);
		if (year.isLeap()) {
			System.out.printf("%d is LeapYear ", value);

		} else {
			System.out.printf("%d is not leap Year", value);
		}

	}

}
