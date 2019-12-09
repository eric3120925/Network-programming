
public class apple {
	public static void main(String[] args) {
		
		food eric[]=new food[2];
		eric[0]=new potpie();
		eric[1]=new tuna();
		
		for(int i=0;i<2;i++) {
			eric[i].eat();
		}
		
	}
}