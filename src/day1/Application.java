package day1;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Application {

	public static void main(String[] args) {
		System.out.println(ZoneId.systemDefault());
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime zoned1 = ZonedDateTime.of(2015, 1, 20, 6, 15, 30, 200, zone);
		System.out.println(zoned1);

	}

}
