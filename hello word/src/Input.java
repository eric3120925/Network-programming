import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //Ctrl+Shift+O import automatically
		
		System.out.println("Enter your name: ");
		String name = input.nextLine(); //與nextLine()差別於讀取 /n(按下Enter)或Tab或空格之前的字串
		System.out.println("Enter your ID: ");
		int value = input.nextInt();
		
		System.out.println("My name is: "+name+", My ID is: "+value);
	}

}
