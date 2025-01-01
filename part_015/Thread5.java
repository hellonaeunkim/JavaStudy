package part_015;

public class Thread5 {
	public static void main(String[] args) {
		
		Thread4 thread = new Thread4();
		thread.start();
		
		synchronized (thread) {
			try {
				System.out.println("thread가 완료될 때 까지 기다립니다.");
				thread.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Total is : " + thread.total);
		}
	}

}

//Thread wait method