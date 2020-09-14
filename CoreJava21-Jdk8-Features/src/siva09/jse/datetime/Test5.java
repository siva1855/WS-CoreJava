package siva09.jse.datetime;

import java.time.LocalDateTime;
import java.time.Month;

public class Test5 {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.of(1993, Month.FEBRUARY, 28, 12, 45);
		System.out.println(localDateTime);
	}

}
