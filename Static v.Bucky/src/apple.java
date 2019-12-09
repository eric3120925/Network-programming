
public class apple {
	public static void main(String[] args) {
		tuna member1 = new tuna("Eric","Mu");
		tuna member2 = new tuna("Steve","Jobs");
		tuna member4 = new tuna("William","Henry");
		tuna member3 = new tuna("Tom","Cruise");
		
		System.out.println();
		
		System.out.println(member2.getFirst());
		System.out.println(member2.getLast());
		System.out.println(member2.getMembers());
		
		System.out.println(tuna.getMembers()); /*class also can use "static" method, 
												*because it can be shared*/
		
		
	}
}
