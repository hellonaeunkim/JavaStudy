package part_015;

public class DaemonThread implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.println("Daemon Thread가 실행 중입니다.");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

		public static void main(String[] args) {
			Thread thread = new Thread (new DaemonThread());
			thread.setDaemon(true);
			thread.start();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Main Thread가 종료됩니다.");
		}
}
