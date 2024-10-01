package part_5;

public class ConstructorOverload {
	
	String name;
	int number;
	
	public ConstructorOverload (String name) {
		this.name = name;
	}
	
	public ConstructorOverload () {
//		this.name = "이름없음";
//		this.number = 0;
		this("이름없음", 0); // 타입에 맞는 생성자 호출
		
	}
	
	public ConstructorOverload (String name, int number) {
		this.name = name;
		this.number = number;
	}

}
