class Machine {
	String name;
	int code;
	public Machine() { //�c�y���(Constructor)�����P���O (class)���W�٬ۦP
		System.out.println("Constructor is running!");
		
		name = "John";
		
	}
	public Machine(String name) {
		this();//this �i�I�s�ۤv�H�~��Constructor (�̿�J���e�P�w) �åB����b�Ĥ@�q
		System.out.println("2nd Constructor is running!");
		this.name = name;
	}
	public Machine(String name, int code) {
		this("Zed");
		System.out.println("3rd Constructor is running!");
		this.name = name;
		this.code = code;
	}
}
public class App {

	public static void main(String[] args) {
		new Machine(); //Constructor�i�H�����H new �I�s,�]�i�H��class���Φ��I�s�õ����N��
		new Machine("aby");
		new Machine("Simons",86);
		System.out.println("--------------------------------");
		Machine m1 = new Machine();
		Machine m2 = new Machine("root");
		Machine m3 = new Machine("Embid",99);
	}

}