
public class multiDimensionalArray {

	public static void main(String[] args) {
		int value[][]= {
				{1,22,333},
				{4,55,666},
				{7,88,999}
		};
		
		for(int row=0; row<value.length; row++) {
			for(int col=0; col<value[row].length; col++) {
				System.out.print(value[row][col] + "\t");
			}
			System.out.println();
		}
		
		String[][] words = new String[3][];
		words[0] = new String[3];
		words[0][1]="HELLO";
		words[1] = new String[4];
		words[1][2]="TO";
		words[2] = new String[5];
		words[2][3]="YOU";
		
		for(int row=0; row<words.length; row++) {
			for(int col=0; col<words[row].length; col++) {
				System.out.print(words[row][col] + "\t");
			}
			System.out.println();
		}

	}

}
