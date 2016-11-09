
public class Client {
	public static void main(String[] args) {
		TV tv  = new TV();
		Car car = new Car();
		
		TwoButtonController rc = new TwoButtonController(tv, car);
		
		rc.button1Pressed();
		rc.button2Pressed();
		
		rc.button1Pressed();
		rc.button2Pressed();
	}
}
