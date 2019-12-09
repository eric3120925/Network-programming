import java.io.*;
import java.lang.*;
import java.util.*;

public class createfile {
	
	private Formatter x;
	
	public void openFile() {
		try {
			x = new Formatter("Chinese.txt");
		}
		catch(Exception e){
			System.out.println("You got an error!!");
		}
	}
	
	public void addRecords() {
		x.format("%s%s%s", "20 ","eric ","alex ");
	}
	
	public void closeFile() {
		x.close();
	}

}
