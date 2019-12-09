import java.io.File;

public class apple {

	public static void main(String[] args) {
		
		File x = new File("D:\\test\\eric.txt"); /* "\" is the escape character because it's "String" 
		 										* if we want the path we need to add "\" again*/
		
		if(x.exists())
			System.out.println(x.getName() + " Exists!");
		else
			System.out.println("This thing does't exist!");

	}

}
