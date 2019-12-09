import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RMIImpl extends UnicastRemoteObject implements RMI {
	private static final long serialVersionUID = 1L;
	protected RMIImpl() throws RemoteException {
		super();
	}
	public String getData(String ID) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?serverTimezone=UTC","root","1234");
		System.out.println("Connected database successfully...");  
		Statement myStmt = myConn.createStatement();
		ResultSet myRs = myStmt.executeQuery("select * from myexample where id2="+"'"+ID+"'");
		if (myRs.next()) {
			System.out.println(myRs.getString("id2")+", "+myRs.getString("name")+", "+myRs.getString("score"));
			ID="id "+myRs.getString("id2")+", name "+myRs.getString("name")+", score "+myRs.getString("score");
			myRs.close();
		}
		return "\nServerReply: "+ ID;
	}
	public String deleteData(String id) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?serverTimezone=UTC","root","1234");
		System.out.println("Connected database successfully...");  
		Statement myStmt = myConn.createStatement();
		String sql = "delete from myexample where id2="+"'"+id+"'";
		int rowsAffected = myStmt.executeUpdate(sql);
		return "\nRows affected: "+ rowsAffected;
	}
	public void insertData(String id,String name,String score) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?serverTimezone=UTC","root","1234");
		System.out.println("Connected database successfully...");  
		Statement myStmt = myConn.createStatement();
		String sql = "insert into myexample (id2, name, score) values("+"'"+id+"'"+","+"'"+name+"'"+","+"'"+score+"'"+")";
		myStmt.executeUpdate(sql);
	}
	public void updateScore(String id,String score)throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?serverTimezone=UTC","root","1234");
		System.out.println("Connected database successfully...");  
		Statement myStmt = myConn.createStatement();
		String sql = "update myexample set score="+"'"+score+"'"+"where id2="+"'"+id+"'";
		myStmt.executeUpdate(sql);
	}
	public List<Student> getStudents()throws Exception{
		List<Student> list = new ArrayList<Student>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?serverTimezone=UTC","root","1234");
		System.out.println("Connected database successfully...");  
		Statement myStmt = myConn.createStatement();
		String sql="SELECT * FROM myexample";
		ResultSet myRs = myStmt.executeQuery(sql);
		while(myRs.next()) {
			Student student =new Student();
			student.setID(myRs.getString("id2"));
			student.setName(myRs.getString("name"));
			student.setScore(myRs.getString("score"));
			list.add(student);
		}
		myRs.close();
		return list;
	}
	public boolean checkAccount(String account, String password)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?serverTimezone=UTC","root","1234");
		System.out.println("Connected database successfully...");  
		Statement myStmt = myConn.createStatement();
		String sql="SELECT * FROM myaccount WHERE account="+"'"+account+"'"+"and password = "+"'"+password+"'";
		ResultSet myRs = myStmt.executeQuery(sql);
		if(myRs.next()) {
			return true;
		}else {
			return false;
		}
	}
	
}
