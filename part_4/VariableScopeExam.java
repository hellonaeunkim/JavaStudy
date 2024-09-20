package part_4;

public class VariableScopeExam {
	int globalScope = 10;
	static int staticVal = 7;
	
	
	public void scopeTest(int value) {
		int localScope = 20;
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	
	public void scopeTest2(int value2) {
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
		System.out.println(value2);
		System.out.println(staticVal);
	}
	

	// A static method can be accessed without creating an object of the class first
	public static void main(String[] args) {
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
		System.out.println(staticVal);
		
		VariableScopeExam v1 = new VariableScopeExam();
		System.out.println(v1.globalScope);
		VariableScopeExam v2 = new VariableScopeExam();
		v1.globalScope = 10;
		v2.globalScope = 20;
		System.out.println(v1.globalScope); // 10
		System.out.println(v2.globalScope); // 20
		v1.staticVal = 50; // 100
		v2.staticVal = 100; // 100 -> 클래스 변수 : static한 변수,값을 저장할 수 있는 공간이 하나밖에 없어서 값을 공유 
		System.out.println(VariableScopeExam.staticVal); // 이렇게 사용하는 것이 바람직 
	}

}
