
public class Application {

	public static void main(String[] args) {
		int[] a = {55,9,66,37,26};
		int max;
		for(int i =0; i < a.length;i++) {
			
			for (int j =0; j <a.length-1;j++) {
				
				if(a[j]>a[j+1]) {
					max=a[j];
					a[j]=a[j+1];
					a[j+1]=max;
				}
			}
		}
		
		for(int i = 0; i < a.length; i++) 
            System.out.print(a[i] + " "); 
	}

}
