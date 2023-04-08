package decorator_pattern;

public abstract class Beverage {
	
	public final static String TALL="TALL";
	public final static String GRANDE="GRANDE";
	public final static String VENTI="VENTI";
	
	String description="Unknow Beverage";
	private String size=TALL;
	
	public String getDescription(){
		return description+","+size;
	}
	
	
	
	public String getSize() {
		return size;
	}



	public void setSize(String size) {
		this.size = size;
	}



	public abstract double cost();
}
