package siva09.jse.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Test9DateOfBirth {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Birth Year :: ");
		int year = scanner.nextInt();

		System.out.println("Enter Birth Month :: ");
		int month = scanner.nextInt();

		System.out.println("Enter Birth Day :: ");
		int date = scanner.nextInt();

		LocalDate todayDate = LocalDate.now();
		
		LocalDate birthdayDate = LocalDate.of(year, month, date);
		Period period = Period.between(birthdayDate, todayDate);
		System.out.printf("Your age is -----> %d years %d months %d days", period.getYears(), period.getMonths(),
				period.getDays());
	}

}
