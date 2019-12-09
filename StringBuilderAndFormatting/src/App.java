
public class App {

	public static void main(String[] args) {
		
		// Inefficient
		String Info = "";
		Info += "My name is Alex.";
		Info += " ";
		Info += "I am a builder.";
		
		System.out.println(Info);
		// More efficient
		StringBuilder sb = new StringBuilder("");
		sb.append("My name is Eric.");
		sb.append(" ");
		sb.append("I am a hacker.");
		
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		s.append("My name is John.")
		.append(" ")
		.append("I am a bus driver.");
		
		System.out.println(s.toString());
		
		
		/*-----------Formatting----------*/
		
		System.out.print("Here is some text.\tTab.\nNew line.");
		System.out.println(" More Text.");
		
		/*-----------Formatting Integers----------*/
		System.out.printf("MY LUCKY_NUMBER IS %d.",7);
		System.out.printf("Total cost: %-5d; quantity is %10d\n",5,150);
		
		/*-----------Formatting Integers and String----------*/
		for(int i =0; i<20; i++) {
			System.out.printf("%-2d: %s\n",i, "Here is some text.");
		}
		
		/*-----------Formatting Floating point value----------*/
		System.out.printf("Value: %.2f\n", 5.6772); //.2 四捨五入至小數點第二位
		System.out.printf("Value: %7.1f\n",395.44875292636);
		System.out.printf("Value: %-15.1f%s\n",395.44875292636,"<--Here is some space.");
		
	}

}
