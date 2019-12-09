import java.util.Scanner;

public class apples {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		tuna tObject = new tuna();
		System.out.println("Enter name of first gf here: ");
		String temp = input.nextLine();
		tObject.setName(temp);
		tObject.saying();
	}
}
