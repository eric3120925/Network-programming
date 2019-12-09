
public class run {
	public static void main(String[] args) {
		encapsulation en = new encapsulation();
		encapsulation EN = new encapsulation("Bo",40);
		System.out.println(EN.sayHello());
		System.out.println("--------------------------------");
		
		animalLion Lion = new animalLion();
		System.out.println("Lion:");
		Lion.state();
		Lion.Energy = 10;
		Lion.HungryDegree = 100;
		Lion.state();
		Lion.eat();
		Lion.sleep();
		Lion.run();
		
		System.out.println("--------------------------------");
		animal Bird = new animalBird();
		System.out.println("Bird:");
		Bird.state();
		Bird.eat();
		Bird.sleep();
		//Bird.fly(); /* <---- because you create "Bird" object from "animal" , not "animalBird", 
					  //       you can't use the method out of the "animal" class. */
	}
}
