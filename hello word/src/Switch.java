import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*System.out.println("Please enter a command: ");
		String text=input.nextLine();
		
		
		switch(text) {
		case "start":
			System.out.println("Machine is START!");
			break;
		case "stop":
			System.out.println("Machine is STOP.");
			break;
			
		default: // �]����n�b�̫�@��,���gbreak; �S�t
			System.out.println("Command is not correct.");
		}*/
		
		System.out.println("�nť����Ы� 1, Listening by English please press '2'");
		int value = input.nextInt();
		
		switch(value) {
		default:  
			System.out.println("���~,There is an error.");
			break;
		case 1:
			System.out.println("�A�n!!");
			break;
		case 2:
			System.out.println("How are you");
			break;
		
		}
	}
}
