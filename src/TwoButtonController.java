
public class TwoButtonController {
	private TV tv;
	private Car car;
	
	public TwoButtonController(TV tv, Car car) {
		this.tv = tv;
		this.car = car;
	}
	
	public void button1Pressed() {
		tv.power();
	}
	
	public void button2Pressed() {
		car.start();
	}
}
