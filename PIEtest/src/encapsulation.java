public class encapsulation {
	private String name ="Eric";
	private int age =23;
	
	public encapsulation(){
		System.out.println("My name is "+name+", I'm "+age+" old");
	}
	
	
	/*-----------------------------------------------------------------*/
	
	public encapsulation(String n,int a) {
		NameAndAge(n,a);
	}
	private void NameAndAge(String n, int a) {
		setName(n);
		setAge(a);
	}
	private void setName(String n) {
		name = n;
		
	}
	private void setAge(int a) {
		age = a;
	}
	private String getName() {
		return name;
	}
	private int getAge() {
		return age;
	}
	public String sayHello() {
		return String.format("MyName:%s , MyAge:%d", getName(), getAge());
	}

	
}
