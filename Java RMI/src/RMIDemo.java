import java.rmi.Remote;
import java.rmi.RemoteException;
public interface RMIDemo extends Remote{
	//do communicating between the client and server
	public String doCommunicate(String name)throws RemoteException;	 //each method in this interface have to "throw RemoteException".
							//  ¡ôthis can be other type of parameter such as int, float, etc.
}
