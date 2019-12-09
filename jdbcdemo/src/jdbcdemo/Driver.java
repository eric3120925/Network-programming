package jdbcdemo;

import java.sql.*;
public class Driver {
	public static void main(String[] args) {
		try {
			//1. Get a connection to DB
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?serverTimezone=UTC","root","1234");
			
			//2. Create a statement
			Statement myStmt = myConn.createStatement();
			
			//3. Execute SQL query
			ResultSet myRs = myStmt.executeQuery("select * from employees");
			
			//4. Process the result
			while (myRs.next()) {
				System.out.println(myRs.getString("first_name")+", "+myRs.getString("last_name"));
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
