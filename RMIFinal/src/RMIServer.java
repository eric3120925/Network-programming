import java.rmi.Naming;


public class RMIServer {
	public static void main(String[] args) throws Exception {
		RMIImpl rmiimpl = new RMIImpl();
		Naming.rebind("RMI", rmiimpl);
		System.out.println("RMI object bound to the name 'RMI' and is ready for use...");
	}

}
