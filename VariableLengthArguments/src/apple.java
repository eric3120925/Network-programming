
public class apple {

	public static void main(String[] args) {
		System.out.println(average(44,58,26,36,77,95,60));

	}
							// "..." means there will be some numbers, but we don't know.
	public static int average(int...numbers) {
		int total=0;
		for(int x:numbers) {
			total+=x;
		}
		return total/numbers.length;
	}

}
