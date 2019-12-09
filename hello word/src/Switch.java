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
			
		default: // 因為剛好在最後一行,不寫break; 沒差
			System.out.println("Command is not correct.");
		}*/
		
		System.out.println("要聽中文請按 1, Listening by English please press '2'");
		int value = input.nextInt();
		
		switch(value) {
		default:  
			System.out.println("錯誤,There is an error.");
			break;
		case 1:
			System.out.println("你好!!");
			break;
		case 2:
			System.out.println("How are you");
			break;
		
		}
	}
}
