public class Robot {
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
