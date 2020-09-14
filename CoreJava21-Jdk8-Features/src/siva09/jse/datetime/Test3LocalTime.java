package siva09.jse.datetime;

import java.time.LocalTime;

public class Test3LocalTime {

	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);

		int hours = localTime.getHour();
		int minits = localTime.getMinute();
		int seconds = localTime.getSecond();
		int nanoSeconds = localTime.getNano();
		System.out.printf("\n%d:%d:%d:%d", hours, minits, seconds, nanoSeconds);
	}

}
