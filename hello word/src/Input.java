import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //Ctrl+Shift+O import automatically
		
		System.out.println("Enter your name: ");
		String name = input.nextLine(); //�PnextLine()�t�O��Ū�� /n(���UEnter)��Tab�ΪŮ椧�e���r��
		System.out.println("Enter your ID: ");
		int value = input.nextInt();
		
		System.out.println("My name is: "+name+", My ID is: "+value);
	}

}
