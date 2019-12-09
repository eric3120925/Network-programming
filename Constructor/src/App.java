class Machine {
	String name;
	int code;
	public Machine() { //構造函數(Constructor)必須與類別 (class)的名稱相同
		System.out.println("Constructor is running!");
		
		name = "John";
		
	}
	public Machine(String name) {
		this();//this 可呼叫自己以外的Constructor (依輸入內容判定) 並且須放在第一段
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
		new Machine(); //Constructor可以直接以 new 呼叫,也可以用class的形式呼叫並給予代號
		new Machine("aby");
		new Machine("Simons",86);
		System.out.println("--------------------------------");
		Machine m1 = new Machine();
		Machine m2 = new Machine("root");
		Machine m3 = new Machine("Embid",99);
	}

}
