package part_012;

import java.text.*;
import java.util.*;


public class DateExam {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date.toString()); // Wed Nov 06 14:43:52 KST 2024, 기본 형식
		
		SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");
		
		System.out.println(ft.format(date)); // 2024.11.06 at 02:49:00 PM KST
		
		System.out.println(date.getTime()); // long 타입의 값으로 현재 시간을 가져옴.
		
		long today	= System.currentTimeMillis(); // long 타입의 값으로 현재 시간을 가져옴.
		
		System.out.println(today);
		
		System.out.println(today - date.getTime()); // long 타입의 시간 값끼리 연산 가능.


	}

}
