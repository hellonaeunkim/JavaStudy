package part_6;

public class AbstractClassChildExam {

	public static void main(String[] args) {
		
		AbstractClassChild child = new AbstractClassChild();
		child.abstractmethodA();
		child.abstractmethodB();
		
		AbstractClass parent = new Parent(); // cannot be used to create objects

	}

}
