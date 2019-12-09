public class animal {
	public int HungryDegree ;
	public int Energy ;
	
	public void state() {
		System.out.printf("HungryDegree: %d , Energy: %d \n",HungryDegree,Energy);
	}
	public void eat() {
		HungryDegree -=10;
		System.out.println("HungryDegree -10%");
		System.out.printf("HungryDegree: %d\n",HungryDegree);
	}
	public void sleep() {
		Energy +=10;
		System.out.println("Energy +10%");
		System.out.printf("Energy: %d\n",Energy);
	}
}
