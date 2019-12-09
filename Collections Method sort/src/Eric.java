import java.util.*;
public class Eric {
	public static void main(String[] args) {
		String[] things = {"apples","lemons","geese","bacon","youtube"};
		/*convert array to list*/
		List<String> l1 = Arrays.asList(things);
		
		Collections.sort(l1);
		System.out.printf("%s\n",l1);
		
		Collections.sort(l1, Collections.reverseOrder()); //Collections.sort(what you want to sort, how you want to sort)
		System.out.printf("%s\n",l1);
	}
}
