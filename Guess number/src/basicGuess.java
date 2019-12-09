import java.util.Scanner;

public class basicGuess {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int value;
		System.out.println("Enter a number :");
		value = input.nextInt();
		do {
			if(value < 50) {
				System.out.println("Your number needs to be HIGHER");
				System.out.println("Enter a number again:");
				value = input.nextInt();
			}
			if(value > 50) {
				System.out.println("Your number needs to be LOWER");
				System.out.println("Enter a number again:");
				value = input.nextInt();
			}
		}while(value !=50);
		System.out.println("You got it!!");
	}
}
