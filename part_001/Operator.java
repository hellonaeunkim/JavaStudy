package first;

public class Operator {

	public static void main(String[] args) {
		
		int i1 = -5;
		int i2 = +i1;
		int i3 = -i1;
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println("i3 = " +i3);
		
		int i4 = ++i3; // i3 = i3 + 1
		System.out.println("i4 = " +i4);
		System.out.println("i3 = " +i3);
		
		int i5 = i3++; // i5 = i3 -> i3 = i3 + 1
		System.out.println("i5 = " + i5);
		System.out.println("i3 = " +i3);
		
		int i = 5;
		int j = 2;
		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / j); // 정수끼리의 연산은 정수값으로만 return
		System.out.println(i / (double)j);
		System.out.println(i % j);
		
		
	}

}
