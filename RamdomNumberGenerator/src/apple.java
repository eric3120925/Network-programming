import java.util.Random;;
public class apple {
	public static void main(String[] args) {
		Random dice = new Random();
		int number;
		
		for(int counter =1; counter<=10; counter++) {
			number = 1+dice.nextInt(6); //random range:0~5(total 6 numbers),thus +1 will make it be 1~6. 
			System.out.println(number);
		}
	}
}
