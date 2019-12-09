import java.util.*;

public class smaple {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = 1;
		do {
			/* try something here */
			try {
				System.out.println("Enter first num: ");
				int n1 = input.nextInt();
				System.out.println("Enter second num: ");
				int n2 = input.nextInt();
				int sum = n1 / n2;
				System.out.println(sum);
				x=2; /*if code runs successfully, then x=2*/
			}
			/* catch error if there are some error */
			catch (Exception e) {
				System.out.println("You can't do that");
			}
		} while (x == 1); /*if x=1, then it will repeat "do" method again*/
	}
}
