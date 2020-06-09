package aaJavaOcaPrep.Chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {


        LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1, 1);
        dt.plusDays(30);
        dt.plusMonths(1);
        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_TIME));
//
//    LocalDate date1 = LocalDate.now();
//    LocalDate date2 = LocalDate.of(2014,6,20);
//    LocalDate date3 = LocalDate.parse("2014-06-20",DateTimeFormatter.ISO_DATE);
//    System.out.println(date1);
//    System.out.println(date2);
//    System.out.println(date3);

//        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
//        LocalTime time = LocalTime.of(5, 15);
//        LocalDateTime dateTime = LocalDateTime.of(date, time)
//                .minusDays(1).minusHours(10).minusSeconds(30);


        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        date.plusDays(10);
        System.out.println(date);

    }
}