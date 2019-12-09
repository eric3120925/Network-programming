import java.rmi.Naming;

public class RMIDemoServer {
	public static void main(String[] args) throws Exception{
		RMIDemoImpl rmidemoimpl = new RMIDemoImpl();
		Naming.rebind("RMIDemo", rmidemoimpl); //it will bind to the registry(rmiregistry) 
											   //--> this is how we can talk and do from the client side
		System.out.println("RMIDemo object bound to the name 'RMIDemo' and is ready for use...");
	}
}
