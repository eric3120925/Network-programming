import java.util.Scanner;

public class apples {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		tuna tObject = new tuna();
		
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		
		tObject.sendMessage(name);
	}
}
