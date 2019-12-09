class Thing {
	public String name; //object
	public static String description; //static屬於 class
	
	public static int count = 0;
	public int id ;
	
	/*Constructor*/
	public Thing() {
		id = count;
		count++;
	}
	
	public void showName() {
		System.out.println(description +":" + name+" ,My id: "+ id);
	}
	public static void showDes() {
		System.out.println(description);
		//Won,t work System.out.println(name);
	}
	public final static int LUCKY_NUMBER = 7; //final型式不可再assign別的value
}

public class App {

	public static void main(String[] args) {
		/*object*/
		
		System.out.println("Before creating objects, count is :"+Thing.count);
		
		Thing t1 = new Thing();
		Thing t2 = new Thing();
		
		System.out.println("After creating objects, count is :"+Thing.count);
		
		t1.name = "John";
		t2.name = "Sue";
		
		Thing.description="I am a Thing";
		
		System.out.println(t1.name);
		System.out.println(t2.name);
		
		t1.showName();
		t2.showName();
		
		/*class*/
		Thing.description = "I belong to class Thing ";
		System.out.println(Thing.description);
		Thing.showDes();
		
		/*-------------*/
		System.out.println(Math.PI);
		//Won't work Math.PI = 3; "PI" is final
		System.out.println(Thing.LUCKY_NUMBER);
		
	}

}
