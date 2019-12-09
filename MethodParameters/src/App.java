class Robot {
	/*method(parameter) よ猭(把计) 
	 *㊣惠璶parametermethod,惠璶﹚篈把计 ex:int , String 单
	 *砞﹚method,碞∕﹚parameterゼㄓ砆㊣,块把计,盢磅︽笆*/
	public void speak (String text) {
		System.out.println("Robot: "+text);
	}
	public void speedState (int speed) {
		System.out.println("My speed: "+speed+" KM/H");
	}
	public void cost (int value, String cType) {
		System.out.println("I need "+value+"$/"+cType);
	}
}
public class App {
	public static void main(String[] args) {
		Robot Dan = new Robot();
		Dan.speak("Helloooooo I'm Dan!!");
		Dan.speedState(40);
		Dan.cost(10, "USD");
		
		System.out.println("--------------------------------");
		String Hi = "Hello my Friend";
		Dan.speak(Hi);
		
		int spd = 99;
		Dan.speedState(spd);
		
		int money = 1000;
		String MoneyTP = "TWD";
		Dan.cost(money, MoneyTP);
	}
}
