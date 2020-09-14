package siva09.jse.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test8CreateZoneId {

	public static void main(String[] args) {
		ZoneId zoneId = ZoneId.of("America/Los_Angeles");
		
		ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
		System.out.println(zonedDateTime);

	}

}
