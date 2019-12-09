class Person{
	// Instance variables (data or "state")
	String name;
	int age;
	
	// Classes can contain
	// 1. Data
	// 2. Subroutines (method)
	
	void speak() {
		System.out.println("My name is "+name+" and I am "+age+" years old.");
	}
	void hello() {
		for (int i = 0; i<3; i++) {
			System.out.println("Hello my friend!");
		}
	}
}
public class App {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Eric";
		p1.age = 23;
		p1.speak();
		p1.hello();
		
		Person p2 = new Person();
		p2.name = "Alex";
		p2.age = 27;
		p2.speak();
		p2.hello();
		
		System.out.println(p1.name+" "+p1.age);
		System.out.println(p2.name+" "+p2.age);
	}
}
