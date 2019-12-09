
public class apple {
	public static void main(String[] args) {
		tuna tObject = new tuna();
		// tObject.hr = 10; <---- won't work
		
		System.out.println(tObject.toMilitary());
		System.out.println(tObject.toString());
		
		tObject.setTime(6, 59, 59);
		System.out.println(tObject.toMilitary());
		System.out.println(tObject.toString());
	}
}
