public class animal {
	public int energy = 50;
	public int hungry = 50;
	
	public void state() {
		System.out.println("Energy: "+getEnergy()+"Hungry: "+getHungry());
	}
	
	public void eat() {
		System.out.println("Dinner time!!");
	}
	
	public void sleep() {
		System.out.println("Time to sleep!");
	}
	
	public int getEnergy() {
		return energy;
	}
	public int getHungry() {
		return hungry;
	}
}
