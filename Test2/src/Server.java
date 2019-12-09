import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {
	static ServerSocket serverSocket;
	public static void main(String[] args) throws Exception{
		int port = 9001;
		String str;
		Socket fromClientSocket = null;
		serverSocket = new ServerSocket(port);
		System.out.println("Your server is online. You connect from client with port : "+ port);
		try {
			fromClientSocket = serverSocket.accept();
			System.out.println("Connection Success");
		} catch (IOException e) {
			Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null,e);
		}
		//INPUT
		InputStream inputStream = fromClientSocket.getInputStream();
		InputStreamReader reader = new InputStreamReader(inputStream);
		BufferedReader inputFromClient = new BufferedReader(reader);
		
		//OUTPUT
		OutputStream outputStream = fromClientSocket.getOutputStream();
		DataOutputStream outputToClient = new DataOutputStream(outputStream);
		
		//SEARCH DATA FORM FILE
		openFile opF = new openFile();
		opF.openfile();
		LinkedList<Student> input = opF.readfile();
		ListIterator <Student> it = input.listIterator();
		
		while((str = inputFromClient.readLine()) != null) {
			System.out.println("Server receive: " + str);
			it = input.listIterator();
			while(it.hasNext()) {
				Student curr = it.next();
				//System.out.printf("id = %s, Name= %s, Score= %s \n",curr.getId(),curr.getName(),curr.getScore());
				if(curr.name.equals(str)) {
					str="id= "+curr.getId()+ "Name= "+curr.getName()+"Score="+curr.getScore()+"\n";
				}
				break;
			}
			String processedData = doOperation(str);
			outputToClient.writeBytes(processedData + "\n");
		}
		
	}
	
	private static String doOperation(String score) {
		return score + " processed from server.";
	}
	
}
