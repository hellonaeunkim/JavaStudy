package first;

public class Operator5 {

	public static void main(String[] args) {
		
		//조건 연산자(삼항 연산자) Conditional Operator
		
		int b1 = (5 < 4) ? 50 : 40;
		System.out.println(b1);
		
		int b2 = 0;
		if(5 < 4) {
			b2 = 50;
		}else {
			b2 = 40;
		}
		System.out.println(b2);
		
		b2 = 5 > 4 ? 50 : 40;
		System.out.println(b2);

	}

}
