package part_8;

public class Exception { 

	public static void main(String[] args) {
		
		// try-catch-finally
		
		int i = 10;
		int j = 0;
		try {
			int k = i / j;
			System.out.println(k);
		}catch(ArithmeticException variableName){
			System.out.println("0으로 나눌 수 없습니다. " + variableName.toString()); // 예외클래스변수명.toString() : 예외의 정보를 알려주는 method
		}finally {
			System.out.println("오류가 발생했든 발생하지 않았든 무조건 실행");
		}
		System.out.println("main end!!");

	}

}

/* Exception : try-catch-finally
 
 1. try : define a block of code to be tested for errors while it is being executed.
 2. catch :  define a block of code to be executed, if an error occurs in the try block.
 3. finally : execute code, after try...catch, regardless of the result.
 
 */
