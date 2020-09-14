package siva09.jse.datetime;

import java.time.LocalDate;


public class Test2LocalDate {

	public static void main(String[] args) {
		LocalDate loaclDate = LocalDate.now();
		System.out.println(loaclDate);

		int date = loaclDate.getDayOfMonth();
		int month = loaclDate.getMonthValue();
		int year = loaclDate.getYear();
		System.out.println(date + " " + month + " " + year);
		System.out.printf("\n%d/%d/%d", date, month, year);

	}

}
