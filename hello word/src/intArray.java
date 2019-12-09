
public class intArray {
	public static void main(String[] args) {
		int[] v=new int[3];
		
		System.out.println(v[0]);
		System.out.println(v[1]);
		System.out.println(v[2]);
		
		v[0]=1;
		v[1]=2;
		v[2]=3;
		
		for(int i=0; i<v.length; i++) {
			System.out.println(v[i]);
		}
		
		int[] n= {4,5,6};
		
		for(int i=0; i<n.length; i++) {
			System.out.println(n[i]);
		}
	}
}
