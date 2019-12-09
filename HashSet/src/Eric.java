import java.util.*;
public class Eric {
	public static void main(String[] args) {
		String[] things = {"apple","bob","tuna","bacon","bob","john"};
		List<String> l = Arrays.asList(things);
		
		System.out.printf("%s ",l);
		System.out.println();
		
		//make duplicate items out of the list
		Set<String> s = new HashSet<String>(l);
		System.out.printf("%s ", s);
	}

}
