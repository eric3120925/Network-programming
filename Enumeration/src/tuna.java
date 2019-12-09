
public enum tuna {
	Eric("nice","22"),
	Lady("cutie","21"),
	Julia("bigmistake","18");
	
	private final String desc;
	private final String year;
	
	tuna(String description, String birthday){
		desc = description;
		year = birthday;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public String getYear() {
		return year;
	}
}
