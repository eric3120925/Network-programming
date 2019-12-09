
public class apple {
	public static void main(String[] args) {
		faty eric = new faty();
		//food fo = new food(); // faty's "digest" method needs "food" object.
		
		food tu = new tuna();
		food po = new potpie();
		
		/*tuna and potpie both extend food, so they are also "food" data type.*/
		tuna tuO = new tuna();
		potpie poO = new potpie();
		
		//eric.digest(fo);
		eric.digest(tu);
		eric.digest(po);
		
		eric.digest(tuO);
		eric.digest(poO);
	}
}
