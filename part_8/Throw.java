package part_8;

public class Throw {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try {
			int k = divide(i, j);
			System.out.println(k);
		}catch(IllegalArgumentException e) {
			System.out.println(e.toString());
		}

	}
	
// not using throw
	
	public static int divide(int i, int j) {
		if (j == 0) {
			System.out.println("2번째 매개변수는 0이면 안됩니다.");
			return 0; // return 0; to stop the code if there's error. But, In the 10th line, print 0.
		}
		int k = i/j;
		return k;
	}
	
// using throw
	
	public static int divide(int i, int j) throws IllegalArgumentException{
		if (j == 0) {
			throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
		}
		int k = i/j;
		return k;
	}

}

/* throw

 1. throw keyword is used to create a custom error.

*/