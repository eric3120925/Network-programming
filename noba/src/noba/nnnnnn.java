package noba;

import java.util.*;

public class nnnnnn {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
		int a = 0;
		int sum =0;
		while(a<3) {
			System.out.println("Enter num1: ");
			x= input.nextInt();
			while (x>0||x<100) {
				System.out.println("Error");
				System.out.println("Enter num1: ");
				x= input.nextInt();
			}
		System.out.println("SUM: "+sum);
	}
}
