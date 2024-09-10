package first;

public class Operator4 {

	public static void main(String[] args) {
		
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;
		// 논리연산자 (Logical Operator)
		System.out.println(b1 && b2);
		System.out.println(b1 && b3);
		System.out.println(b1 || b2);
		System.out.println(b1 || b2);
		System.out.println(b2 || b4);
		
		int score = 88;
		if(score <= 100 && score >= 70 ) {
			System.out.println("Success");
		}else {
			System.out.println("Fail");
		}
		
		System.out.println(b1 ^ b3);
		System.out.println(b1 ^ b2);
		System.out.println(!b1);

	}

}
