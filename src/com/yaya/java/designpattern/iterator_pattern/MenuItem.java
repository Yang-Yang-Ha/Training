package iterator_pattern;

public class MenuItem {
	
	private String name;
	private String description;
	private boolean vegetatarian;
	private double price;
	
	public MenuItem(String name,String description,boolean vegetatarian,double price){
		this.name=name;
		this.description=description;
		this.vegetatarian=vegetatarian;
		this.price=price;
	}
	
	public String getName(){
		return name;
	}
	
	public String getDescription(){
		return description;
	}
	
	public boolean getVegetatarian(){
		return vegetatarian;
	}
	
	public double getPrice(){
		return price;
	}

}
