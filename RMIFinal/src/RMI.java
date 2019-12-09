import java.rmi.Remote;
import java.util.*;

public interface RMI extends Remote{
	public String getData(String name) throws Exception;
	public String deleteData (String id) throws Exception;
	public void insertData(String id,String name,String score) throws Exception;
	public void updateScore(String id,String score)throws Exception;
	public List<Student> getStudents()throws Exception;
	public boolean checkAccount(String account, String password)throws Exception;
}
