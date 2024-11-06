package part_5;

public class MethodOverloadExam {

	public static void main(String[] args) {
		MethodOverload method = new MethodOverload();
		
		System.out.println(method.plus(4, 5));
		System.out.println(method.plus(1, 2, 3));
		System.out.println(method.plus("hello ", "world"));

	}

}
