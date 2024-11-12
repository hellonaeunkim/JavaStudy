package part_012;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {

	public static void main(String[] args) {
		LocalDateTime timePoint = LocalDateTime.now(); // now() method : Display current date and time.
		System.out.println(timePoint);
		
		LocalDate ldl = LocalDate.of(2024, Month.DECEMBER, 25); // 2024-12-25
		System.out.println(ldl);
		
		LocalTime ltl = LocalTime.of(17, 18); // 17:18
		System.out.println(ltl);
		LocalTime ltl2 = LocalTime.parse("10:15:30");
		System.out.println(ltl2);
		
		LocalDate theDate = timePoint.toLocalDate(); // 2024-11-12 : Display current date.
		Month month = timePoint.getMonth();
		System.out.println(month.getValue()); // 11 : Display current month as int.
		System.out.println(theDate);
		System.out.println(timePoint.getMonth()); // NOVEMBER : Display current month.
		System.out.println(timePoint.getHour()); // 21 : Diaplay current hour as 24-hour-clock.
		

	}

}

/*
 
 * java.time package
 1. work with the date and time API
 2. The package includes many date and time classes.
 
 * LocalDateTime class
 1. Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
 
 */
