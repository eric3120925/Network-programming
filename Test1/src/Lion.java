
public class Lion extends animal{
	private int energy = 100;
	private int hungry = 50;
	
	public void state() {
		System.out.println("Energy: "+getEnergy()+", Hungry: "+getHungry());
	}
	
	public void eat() {
		hungry -=20;
		System.out.println("Dinner time!!");
		System.out.println("Hungry: "+getHungry());
	}
	
	public void sleep() {
		energy +=20;
		System.out.println("Time to sleep!");
		System.out.println("Energy: "+getEnergy());
	}
	
	public void run() {
		energy -=20;
		hungry +=20;
		System.out.println("Run a way");
		System.out.println("Energy: "+getEnergy()+", Hungry: "+getHungry());
	}
	public int getEnergy() {
		return energy;
	}
	public int getHungry() {
		return hungry;
	}
}
