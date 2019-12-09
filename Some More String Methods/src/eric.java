
public class eric {
	public static void main(String[] args) {
		
		String s = "ericalexericalexericalexes";
		/*search the "first" index of 'some word'*/
		System.out.println(s.indexOf('c')); 
		/*search the "first" index of "some words"*/
		System.out.println(s.indexOf("alex")); 
		/*search index of 'some word' from "4th" word */
		System.out.println(s.indexOf('c',4));
		/*search index of "some words" from "5th" word */
		System.out.println(s.indexOf("alex",5));
		
		String a = "Tuna";
		String b = "potpie";
		String c = "     john      ";
		/*contact the two string*/
		System.out.println(a.concat(b));
		/*replace the word*/
		System.out.println(a.replace('T', 'F'));
		/*upper case to the words*/
		System.out.println(b.toUpperCase());
		/*quit the space*/
		System.out.println(c.trim());
	}
	
}
