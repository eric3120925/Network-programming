
public class Bird extends animal{
	
	
	public void state() {
		System.out.println("Energy: "+getEnergy()+", Hungry: "+getHungry());
	}
	
	public void eat() {
		hungry -=10;
		System.out.println("Dinner time!!");
		System.out.println("Hungry: "+getHungry());
	}
	
	public void sleep() {
		energy +=10;
		System.out.println("Time to sleep!");
		System.out.println("Energy: "+getEnergy());
	}
	
	public void fly() {
		energy -=10;
		hungry +=10;
		System.out.println("Fly a way");
		System.out.println("Energy: "+getEnergy()+", Hungry: "+getHungry());
	}
	public int getEnergy() {
		return energy;
	}
	public int getHungry() {
		return hungry;
	}
}
