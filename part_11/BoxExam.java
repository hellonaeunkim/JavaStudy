package part_11;

public class BoxExam {

	public static void main(String[] args) {
		
		Box box = new Box();
		box.setObj(new Object());
		Object obj = box.getObj();
		
		box.setObj("Hello"); // Object class를 상속 받은 다른 모든 객체들 가능 ex. String, Integer...
		box.getObj(); // 하지만, 이 경우 자식 class method 사용 불가. Object 타입으로 return 하게 됨. (ref. part_6 ClassTCChildExam)
		String str = (String)box.getObj(); // Object를 return하는 method에서 Object를 상속 받은 객체로 반환하고 싶은 경우 Type Casting 필요 
		
		box.setObj(1);
		int value = (int) box.getObj();
		

	}

}
