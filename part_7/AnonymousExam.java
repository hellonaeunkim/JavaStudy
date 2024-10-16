package part_7;

public class AnonymousExam {

	public static void main(String[] args) {
		
		// in general using the inherited an abstract class
		
		AnonymousClass action = new AnonymousChild(); // abstract class can't create an object
		action.exec();
		
		// using anonymous class
		
		AnonymousClass action2 = new AnonymousClass() {
			
			@Override
			public void exec() {
				System.out.println("exec");
			}
		};
		action2.exec();

	}

}
