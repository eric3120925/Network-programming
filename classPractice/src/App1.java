class member{
	String name;
	int age;
	
	int caculateYearsToRetirement (){
		int leftYears = 65 - age;
		return leftYears;
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
}
public class App1 {
	public static void main(String[] args) {
		member p1 = new member();
		p1.name = "Eric";
		p1.age = 25;
		
		System.out.println("NAME: "+p1.getName()+" AGE: "+p1.age);
		System.out.println("TIME TO RETIRE: " + p1.caculateYearsToRetirement()+" YEARS LATER.");
	}
	
}
