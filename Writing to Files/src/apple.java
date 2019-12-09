
public class apple {
	public static void main(String[] args) {
		createfile cf = new createfile();
		cf.openFile();
		cf.addRecords();
		cf.closeFile();
	}
}
