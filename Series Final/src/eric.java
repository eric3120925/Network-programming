public class eric {
	public static void main(String[] args) {
		
		String a ="apple";
		String b ="eric";
		String c ="ERIC";
		System.out.println(a.length());
		
		if(a.equals("apple")) { /*compare string*/
			System.out.println("It equals apple!!");
		}
		if(b.equalsIgnoreCase(c)) { /*compare string without worrying about case*/
			System.out.println("eric match!!");
		}
		
		
	}
}
