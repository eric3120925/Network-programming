import java.util.*;
public class eric {
	public static void main(String[] args) {
		String[] stuff = {"babies","watermelong","melons","fuge"};
		LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));
		
		thelist.add("pumpikin");
		thelist.addFirst("firstthing");
		
		//convert back to an array
		stuff = thelist.toArray(new String[thelist.size()]);
		
		for(String x:stuff){
			System.out.printf("%s ",x);
		}
	}
}
