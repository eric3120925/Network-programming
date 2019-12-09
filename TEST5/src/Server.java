import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {
	static ServerSocket serverSocket;
	public static void main(String[] args) throws Exception{
		//SQL
		openFile opF = new openFile();
		opF.openfile();
		LinkedList<Student> input = opF.readfile();
		ListIterator <Student> it = input.listIterator();
		while(it.hasNext()) {
			Student curr = it.next();
			System.out.printf("id = %s, Name= %s, Score= %s \n",curr.getId(),curr.getName(),curr.getScore());
			try {
				//1. Get a connection to DB
				Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?serverTimezone=UTC","root","1234");
				//2. Create a statement
				Statement myStmt = myConn.createStatement();
				
				//3. Execute SQL query
				String sql1 = "insert into myexample (id2, name, score) values('"+curr.getId()+"','"+curr.getName()+"', '"+curr.getScore()+"')";
				myStmt.executeUpdate(sql1);
				System.out.println("Insert complete!!");
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		int port = 9001;
		String str;
		//String str2 = null;
		Socket fromClientSocket = null;
		serverSocket = new ServerSocket(port);
		System.out.println("Your server is online. You connect from client with port : "+ port);
		try {
			fromClientSocket = serverSocket.accept();
			System.out.println("Connection Success");
		} catch (IOException e) {
			Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null,e);
		}
		//Client INPUT
		InputStream inputStream = fromClientSocket.getInputStream();
		InputStreamReader reader = new InputStreamReader(inputStream);
		BufferedReader inputFromClient = new BufferedReader(reader);
		
		//SEARCH DATA FORM FILE
		str = inputFromClient.readLine();
		//boolean connection = true;
		System.out.println("Server receive: " + str);
		//1. Get a connection to DB
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?serverTimezone=UTC","root","1234");
		while(str !=null) {
			try {
				//2. Create a statement
				Statement myStmt = myConn.createStatement();
				
				//3. Execute SQL query
				ResultSet myRs = myStmt.executeQuery("select * from myexample where name="+"'"+str+"'");
				
				//4. Process the result
				if (myRs.next()) {
					System.out.println(myRs.getString("id2")+", "+myRs.getString("name")+", "+myRs.getString("score"));
					str="id "+myRs.getString("id2")+", name "+myRs.getString("name")+", score"+myRs.getString("score");
					//OUTPUT
					OutputStream outputStream = fromClientSocket.getOutputStream();
					DataOutputStream outputToClient = new DataOutputStream(outputStream);
					String processedData = doOperation(str);
					outputToClient.writeBytes(processedData + "\n");
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	private static String doOperation(String score) {
		return score;
	}
}
