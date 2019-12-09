
public class animalBird extends animal{
	private int HungryDegree =30;
	
	public void state() {
		System.out.printf("HungryDegree: %d , Energy: %d \n",HungryDegree,Energy);
	}
	
	public void eat() {
		HungryDegree -=5;
		System.out.println("HungryDegree -5%");
		System.out.printf("HungryDegree: %d\n",HungryDegree);
	}
	
	public void sleep() {
		Energy +=70;
		System.out.println("Energy +70%");
		System.out.printf("Energy: %d\n",Energy);
	}
	public void fly() {
		Energy -=30;
		System.out.println("Fly a way!!");
		System.out.printf("Energy: %d\n",Energy);
	}
}
