package part_7;

public interface Calculator {
	
	public int plus(int i, int j);
	public int multiple(int i, int j);
	
	default int minus(int i, int j){
		return i - j;
	}
	
	public static int minus2(int i, int j) {
		return i - j;
	}
	

}

/*
 
 default method in interface
 
 1. interface에서도 method 구현 가능하게 하는 키워드 
 2. interface를 상속받는 모든 클래스에서 method를 구현해야하므로 불필요한 구현을 줄이기 위해서 사용
 
 static method in interface
 
 1. interface name.method name
 
 */
