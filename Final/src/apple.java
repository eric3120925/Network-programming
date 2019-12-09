
public class apple {
	public static void main(String[] args) {
		tuna tOb = new tuna(6);
		
		for(int i=0; i<5;i++) {
			tOb.add();
			System.out.printf("%s",tOb);
			
			//tOb.NUMBER = 14; NUMBER can't change, because it got final value
		}
	}
}
