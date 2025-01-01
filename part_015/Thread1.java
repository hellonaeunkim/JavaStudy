package part_015;

public class Thread1 extends Thread {

	String str;
	public Thread1(String str) {
		this.str = str;
	}
	
	@Override
	public void run() {
		
		// 쓰레드에서 실행할 작업
		for(int i = 0; i < 10; i++) {
			System.out.println(str);
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}
