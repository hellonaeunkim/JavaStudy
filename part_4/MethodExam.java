package part_4;

public class MethodExam {

	public static void main(String[] args) {
		
		// To use a particular class of methods, first create an object
		Method method = new Method();
		
		method.method1();
		
		method.method2(10);
		
		int value = method.method3();
		System.out.println("m3이 return한 값 : " + value);
		
		method.method4(5, 10);
		
		int value2 = method.method5(55);
		System.out.println("m5가 return한 값 : " + value2);

	}

}
