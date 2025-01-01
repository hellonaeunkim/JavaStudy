package part_015;

public class JoinExam {

	public static void main(String[] args) {
		Thread3 thread = new Thread3();
		thread.start();
		
		System.out.println("Start");
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("End");

	}

}
