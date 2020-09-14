package siva09.jse.datetime;

import java.time.LocalDateTime;

public class Test6CustomizedDate {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.of(1993, 02, 9, 12, 45);
		System.out.println(localDateTime);
		System.out.println("After six months ::" + localDateTime.plusMonths(6));
		System.out.println("Before six months :: " + localDateTime.minusMonths(6));
	}

}
