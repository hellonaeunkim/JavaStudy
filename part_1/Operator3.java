package first;

public class Operator3 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		int c = 15;
		
		System.out.println(a - b * c); // (b * c) - a
		System.out.println((a - b) * c);
		System.out.println(a > 5 && b > 5); // a > 5 and b > 5
		System.out.println(a > 5 || b > 5); // a > 5 or b > 5
		System.out.println(++a - 5); // a = a + 1 후에, a - 5
		System.out.println(a);
		System.out.println(a++ - 5); // a - 5 후에, a = a + 1
		System.out.println(a);

	}

}
