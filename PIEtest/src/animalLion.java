
public class animalLion extends animal{
	public int Energy =100;
	
	public void state() {
		System.out.printf("HungryDegree: %d , Energy: %d \n",HungryDegree,Energy);
	}
	public void eat() {
		HungryDegree -=20;
		System.out.println("HungryDegree -20%");
		System.out.printf("HungryDegree: %d\n",HungryDegree);
	}
	public void sleep() {
		Energy +=10;
		System.out.println("Energy +10%");
		System.out.printf("Energy: %d\n",Energy);
	}
	
	public void run() {
		Energy -=30;
		System.out.println("Run a way!!");
		System.out.printf("Energy: %d\n",Energy);
	}
}
