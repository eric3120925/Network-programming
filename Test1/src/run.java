
public class run {
	public static void main(String[] args) {
		System.out.println("Lion:");
		Lion l = new Lion();
		l.state();
		l.sleep();
		l.eat();
		l.run();
		
		System.out.println("------------------------------------------");
		System.out.println("Bird:");
		Bird b = new Bird();
		b.state();
		b.sleep();
		b.eat();
		b.fly();
		
		System.out.println("------------------------------------------");
		animal l1 = new Lion();
		animal b1 = new Bird();
		l1.state();
		b1.state();
		
	}
}
