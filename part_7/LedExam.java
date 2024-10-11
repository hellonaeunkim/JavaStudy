package part_7;

public class LedExam {

	public static void main(String[] args) {
		
		TV tv = new LedTV(); // 참조변수 타입으로 interface 사용 가능, 이 경우 interface method만 사용 가능 (Like, 상속)
		
		tv.turnOn();
		tv.changeChannel(0);
		tv.changeVolume(0);
		tv.turnOff();

	}

}
