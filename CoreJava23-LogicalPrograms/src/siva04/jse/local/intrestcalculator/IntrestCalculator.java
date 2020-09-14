package siva04.jse.local.intrestcalculator;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class IntrestCalculator {

	public static void main(String[] args) {

		System.out.println("         *****Welcome To Local Intrest Calculator *****        ");
		System.out.println("         ----------------------------------------------         ");

		Scanner scanner = new Scanner(System.in);

		System.out.println(".........Initial Amount Taken Date Details............. ");
		System.out.print("Enter Year :: ");
		int initialYear = scanner.nextInt();
		System.out.print("Enter Month :: ");
		int initialMonth = scanner.nextInt();
		System.out.print("Enter Day :: ");
		int initialDate = scanner.nextInt();
		LocalDate initialLocalDate = LocalDate.of(initialYear, initialMonth, initialDate);

		System.out.println("............Present Calculate Date Details...............");
		System.out.print("Enter Year :: ");
		int presentYear = scanner.nextInt();
		System.out.print("Enter Month :: ");
		int presentMonth = scanner.nextInt();
		System.out.print("Enter Day :: ");
		int presentDate = scanner.nextInt();
		LocalDate presentLocalDate = LocalDate.of(presentYear, presentMonth, presentDate);

		Period period = Period.between(initialLocalDate, presentLocalDate);

		System.out.printf("Your Total consumed Date is -----> %d years %d months %d days", period.getYears(),
				period.getMonths(), period.getDays());
		System.out.println();
		System.out.println("........................................");

		System.out.print("Enter Initial Amount::");
		double initialAmount = scanner.nextDouble();
		System.out.print("Enter Intrest Rate::");
		double intrestRate = scanner.nextDouble();

		double intrest = initialAmount / 100 * intrestRate;

		System.out.println("...................................");
		double perDayAmount = intrest / 30;
		System.out.println("per Day :: " + perDayAmount);
		double totalDateAmount = period.getDays() * perDayAmount;
		System.out.println("total of Days amount :: " + totalDateAmount);

		double monthAmount = intrest * period.getMonths();
		System.out.println("Total months Amonut :: " + monthAmount);

		double yearAmount = intrest * 12 * period.getYears();
		System.out.println("Total years Amount :: " + yearAmount);

		double TotalAmount = yearAmount + monthAmount + totalDateAmount + initialAmount;
		System.out.println("Final Amount :: " + TotalAmount);
	}

}
