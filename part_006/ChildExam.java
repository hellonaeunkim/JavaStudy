package part_6;

public class ChildExam {

	public static void main(String[] args) {
		
		Child child = new Child();
		child.run();
		child.ppangpang();
		
		Parent parent = new Parent(); 
		parent.run();
		parent.ppangpang(); // 부모 클래스는 자식 클래스 메소드 사용 불가능

	}

}
