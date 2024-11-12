package part_012;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance(); //getInstace()는 static method 이므로 객체 구현 없이 호출 가능.
		
		System.out.println(cal.get(Calendar.YEAR)); // get the current year as an integer.
		System.out.println(cal.get(Calendar.MONTH)+1);// Starting from 0 to 11.
		System.out.println(cal.get(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.HOUR)); // 3 -> 12-hour-clock
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)); // 15 -> 24-hour-clock
		System.out.println(cal.get(Calendar.MINUTE));
		
		cal.add(Calendar.HOUR, 5); // add +5 to the current time

	}

}

/*
 
 * Calendar
 
 1. Calendar class is an abstract class that provides methods for converting date between 
 a specific instant in time and a set of calendar fields such as MONTH, YEAR, HOUR, etc.
 
 2. It inherits Object class and implements the Comparable, Serializable, Cloneable interfaces.
 
 3. Calendar 클래스는 추상 클래스이므로, 직접 인스턴스를 생성할 수 없다. 
 이러한 Calendar 클래스를 상속받아 그레고리오 달력을 완전히 구현한 하위 클래스인 GregorianCalendar 클래스의 getInstance()
 method를 이용해 Calendar Class를 사용할 수 있다.
 
 */
