package part_6;

public class AccessModifier { // Access Modifier : controls the access level
	
	public int p = 3; // public : The code is accessible for all classes. (전체공개)
	
	protected int p2 = 4; // protected : The code is accessible in the same package and subclasses. (같은 패키지, 상속 받는 자식 클래스 접근 가능)
	
	int k = 2; // default : The code is accessible only within the package. (같은 패키지 접근 가능) 
	
	private int i = 1; // private : It cannot be accessed from outside the class. (자기 자신만 접근 가능)
	
	

}
