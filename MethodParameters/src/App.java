class Robot {
	/*method(parameter)�� ��k(�Ѽ�) 
	 *�I�s�ݭnparameter��method,�ݭn��J���w���A���Ѽ� ex:int , String ��
	 *�]�wmethod��,�N�i�M�w��parameter�b���ӳQ�I�s,��J�Ѽƫ�,�N���檺�ʧ@*/
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
