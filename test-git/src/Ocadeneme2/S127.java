package Sorular101;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class S127 {

	public static void main(String[] args) {

		String date= LocalDateTime.parse("2015-05-10 11:22:33")
				.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(date);
	}

}
