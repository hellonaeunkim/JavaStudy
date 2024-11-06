package part_5;

public class Constructor {
		String name;
		int number;

	
	public Constructor(String name) { // 변수명은 지나치게 축약하기 보다는 알아보기 쉽게 설정하는 것이 좋음 ex. n -> name
		this.name = name; // 멤버 변수과 매개 변수 이름이 동일 할 때 사용
	}

}
