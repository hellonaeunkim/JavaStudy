package part_10;

public class Wrapper {
	
	public static void main(String[] args) {
		
		int i = 5;
		
		Integer i2 = new Integer(5);
		
		Integer i3 = 5; // autoboxing : 기본 타입 데이터를 객체 타입의 데이터로 자동 형변환 시켜주는 기능
						// Integer i3 = new Integer(5);로 인식
		
		int i4 = i3.intValue();
		
		int i5 = i3; // unboxing :객체 타입의 데이터를 기본형 타입 데이터로 자동 형변환
	}

}

/* 

 * java.lang package
	-> Provides classes that are fundamental to the design of the Java programming language.
	ex. wrapper, String, StringBuilder, Math, Object, StringBuffer, System...
	
 * wrapper class
	1. To create a wrapper object, use the wrapper class instead of the primitive type.

*/