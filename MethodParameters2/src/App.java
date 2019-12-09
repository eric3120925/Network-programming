class Person{
	//String name;
	//int age;
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setInfo (String name,int age) {
		setName(name);
		setAge(age);
	}
}
public class App {
	public static void main(String[] args) {
		Person p1 = new Person();
		//p1.name = "Eric";
		//p1.age = 18;
		
		p1.setName("Eric");
		p1.setAge(18);
		
		Person p2 = new Person();
		
		p2.setInfo("Alex", 25);
		
		System.out.println(p1.getName()+"\n"+p1.getAge());
		System.out.println(p2.getName()+"\t"+p2.getAge());
		
	}
}
