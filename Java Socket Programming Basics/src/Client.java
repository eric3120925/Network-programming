import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("(Client App) Server IP(blank for localhost):");
		String serverip = scanner.nextLine();
		if(serverip == null || "".equals(serverip)) {
			serverip = "localhost";
		}
		
		System.out.println("Server Port(>9000):");
		int port = scanner.nextInt();
		
		try (Socket socket = new Socket(serverip, port)){
			System.out.println("Input to process in the server("+serverip+":"+port+"):");
			//client input
			BufferedReader inputTakerFromClient = new BufferedReader(new InputStreamReader(System.in));
			String inputFromClient = inputTakerFromClient.readLine();
			OutputStream outStream = socket.getOutputStream();
			DataOutputStream dataOutputStream = new DataOutputStream(outStream);
			dataOutputStream.writeBytes(inputFromClient + "\n");
			
			BufferedReader processedDataFromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String processedData = processedDataFromServer.readLine();
			System.out.println("Processed Data from Server: " + processedData);
		}
	}
}
