
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class S07 {
 public static void main(String[] args) {
	LocalDateTime dt= LocalDateTime.of(2014, 7, 31, 1, 1 );
	 LocalDate dt1=LocalDate.of(2020,6,2);
	 System.out.println(dt1);
	 System.out.println(dt);
	 dt.plusDays(30);
	dt.plusMonths(1);
	System.out.println(dt.format (DateTimeFormatter.ISO_DATE));
}
}
