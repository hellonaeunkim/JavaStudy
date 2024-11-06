package part_10;

public class MathEx {

	public static void main(String[] args) {
		
		int value1 = Math.max(5, 30);
		System.out.println(value1);
		
		int value2 = Math.min(5, 30);
		System.out.println(value2);
		
		System.out.println(Math.abs(-10));
		
		System.out.println(Math.random());
		
		System.out.println(Math.sqrt(25));

	}

}

/*

 * Math Class 
 1. 수학 연산을 수행하는 데 사용되는 유틸리티 클래스
 2. 생성자 자체가 private 이므로, new 연산자를 이용해서 객체 생성 불가.
 3. 모든 method와 속성이 static으로 정의되어있기 때문에 객체 생성하지 않고 사용 가능.
 4. More : https://docs.oracle.com/javase/7/docs/api/java/lang/Math.html 
 
 */
