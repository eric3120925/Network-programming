
public class tuna {
	private int hr = 1;
	private int min = 2;
	private int sec = 3;
	//-------private object/class only used in same class--------//
	
	public void setTime (int hr,int min,int sec) {
		this.hr = 4; //add "this" will force it to use this parameter.
		this.min = 5;
		this.sec = 6;
	}
	
	
	public String toMilitary() {
		return String.format("%02d:%02d:%02d", hr, min, sec);
	}
	
	public String toString() {
		return String.format("%d:%02d:%02d %s", ((hr==0||hr==12)?12:hr%12), min, sec, (hr< 12? "AM": "PM"));
	}
	
}
