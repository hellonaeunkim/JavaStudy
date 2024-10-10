package part_6;

public class ClassTCChildExam {

	public static void main(String[] args) {
		
		ClassTypeCasting ctc = new ClassTCChild(); // 부모 클래스로 자식 객체 생성 가능 but, 부모 클래스 메소드만 사용 가능
		
		ctc.parent();
		
		ctc.child(); // 자식 클래스 메소드 사용 불가능 
		
		ClassTCChild ctcchild = ctc; // the downcasting from a superclass to a subclass need ().
		ClassTCChild ctcchild2 = (ClassTCChild)ctc;
		
		ctcchild2.parent();
		ctcchild2.child();
		

	}

}
