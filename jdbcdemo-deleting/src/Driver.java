import java.sql.Connection;
import java.sql.DriverManager;
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
			String sql = "delete from employees where last_name='Brown'";
			
			int rowsAffected = myStmt.executeUpdate(sql);
			
			System.out.println("Rows affected: "+ rowsAffected);
			System.out.println("Delete complete!!");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
