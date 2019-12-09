import java.rmi.Naming;
import java.util.List;
import java.util.Scanner;


public class RMIClient {
	public static void main(String[] args) {
		try {
			String url =new String("rmi://localhost/RMI");
			RMI rmi = (RMI)Naming.lookup(url);
			String serverReply;
			Scanner input = new Scanner(System.in);
			System.out.println("Choose your identity: 1.Student, 2.Teacher");
			int Ci = input.nextInt();
			switch(Ci) {
				case 1:
					System.out.println("Enter your ID : ");
					String SID = input.next();
					serverReply =rmi.getData(SID);
					System.out.println("Server: "+serverReply);
					break;
				case 2:
					System.out.println("Enter your account: ");
					String account =input.next();
					System.out.println("Enter your password: ");
					String password=input.next();
					boolean check =rmi.checkAccount(account,password);
					if(check==true) {
						System.out.println("Choose the action: 1.Search, 2.Delete, 3.Add, 4.Update score, 5.Check all, 6.Exit");
						int x = input.nextInt();
						while(x<6) {
							switch(x) {
							case 1:
								System.out.println("Enter ID : ");
								String ID = input.next();
								serverReply =rmi.getData(ID);
								System.out.println("Server: "+serverReply);
								break;
							case 2:
								System.out.println("Enter id : ");
								String delete = input.next();
								serverReply=rmi.deleteData(delete);
								System.out.println("Delete complete! Server: "+serverReply);
								break;
							case 3:
								System.out.println("Enter id : ");
								String insertID=input.next();
								System.out.println("Enter name : ");
								String insertName=input.next();
								System.out.println("Enter score : ");
								String insertScore=input.next();
								rmi.insertData(insertID, insertName, insertScore);
								System.out.println("Insert complete!");
								break;
							case 4:
								System.out.println("Enter id: ");
								String updateID=input.next();
								System.out.println("Enter score :");
								String updateScore=input.next();
								rmi.updateScore(updateID, updateScore);
								System.out.println("Update complete!");
								break;
							case 5:
								List<Student> list = rmi.getStudents();
								for(Student s : list) {
									System.out.println("ID: "+s.getID());
									System.out.println("Name: "+s.getName());
									System.out.println("Score: "+s.getScore());
									
								}
						}
							System.out.println("");
							System.out.println("Enter a number to choose the action: 1.Search, 2.Delete, 3.Add, 4.Update score, 5.Check all, 6.Exit");
							x = input.nextInt();
						}
					}else {
						System.out.println("Error!!");
					}
			}
		}catch(Exception e) {
			System.err.println("Usage: RMIClient <name>");
			System.err.println("Client exception: " + e.toString()); 
	        e.printStackTrace(); 
		}
	}
}
