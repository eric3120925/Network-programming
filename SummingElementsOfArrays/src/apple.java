
public class apple {
	public static void main(String[] args) {
		int bucky[]= {5,78,31,54,92};
		int sum=0;
		
		for(int counter=0; counter<bucky.length; counter++) {
			sum+=bucky[counter];
			int num = counter+1;
			
			System.out.println("The sum + "+bucky[counter]+" = "+sum );
		}
		
		System.out.println("The sum of these num: " + sum);
	}
}
