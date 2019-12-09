import java.io.*;
import java.util.*;

public class openFile {
	private Scanner x;
	
	public void openfile() {
		try {
			x = new Scanner(new File("D:\\score.dat"));
		}
		catch(Exception e) {
			System.out.println("You got an error!!");
		}
	}
	public LinkedList <Student> readfile(){
		
		LinkedList <Student> stuList = new LinkedList <Student>();
		
		while(x.hasNext()) {
			String id = x.next();
			String name = x.next();
			String score = x.next();
			
			Student addStudent = new Student(id,name,score);
			stuList.add(addStudent);
		}
		
		return stuList;
	}
	public void closefile() {
		x.close();
	}
}
