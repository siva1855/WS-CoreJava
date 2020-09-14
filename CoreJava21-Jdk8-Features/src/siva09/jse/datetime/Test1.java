package siva09.jse.datetime;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test1 {

	public static void main(String[] args) {

		LocalDate loaclDate = LocalDate.now();
		System.out.println(loaclDate);
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
	}

}
