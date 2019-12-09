import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;

public class run {
	public static void main(String[] args) {
		/*String url = "jdbc:mysql://localhost:3306/demo?serverTimezone=UTC";
		String user = "root";
		String password = "1234";*/
		openFile opF = new openFile();
		opF.openfile();
		LinkedList<Student> input = opF.readfile();
		ListIterator <Student> it = input.listIterator();
		while(it.hasNext()) {
			Student curr = it.next();
			System.out.printf("id = %s, Name= %s, Score= %s \n",curr.getId(),curr.getName(),curr.getScore());
		}
	}
	
}
