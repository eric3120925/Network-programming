import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Driver {
	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/demo?serverTimezone=UTC";
		String user = "root";
		String password = "1234";
		
		try {
			//1. Get a connection to DB
			Connection myConn = DriverManager.getConnection(url,user,password);
			
			//2. Create a statement
			Statement myStmt = myConn.createStatement();
			
			//3. Execute SQL query
			/*String sql = "insert into employees"
						  + "(first_name, last_name, email)"
						  + "values('David','Brown', 'david.brown@qoo.com')";*/
			String sql1 = "insert into employees (first_name, last_name, email) values('David','Brown', 'david.brown@qoo.com')";
			myStmt.executeUpdate(sql1);
			System.out.println("Insert complete!!");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		/*
		insert into employees (first_name, last_name, email) values('David','Brown', 'david.brown@qoo.com')*/
		

	}

}
