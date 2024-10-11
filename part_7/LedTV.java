package part_7;

public class LedTV implements TV {

	@Override
	public void turnOn() {
		System.out.println("Turn On");
	}

	@Override
	public void turnOff() {
		System.out.println("Turn Off");
	}

	@Override
	public void changeVolume(int volume) {
		System.out.println("Change Volume");
	}

	@Override
	public void changeChannel(int channel) {
		System.out.println("Change Channel");
	}

}
