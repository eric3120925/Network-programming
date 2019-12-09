class Frog{
	public int id;
	public String name;
	
	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		
		return String.format("%-4d: %s", id,name);
		
		/*//�����g�k
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString();
		*/
		
		/*return id + ":"+name; //���������g�k*/
	}
}

public class App {
	public static void main(String[] args) {
		
		Frog f1 =new Frog(7,"Bob");
		Frog f2 = new Frog(1,"Roger");
		
		System.out.println(f1);
		System.out.println(f2);
	}
}
