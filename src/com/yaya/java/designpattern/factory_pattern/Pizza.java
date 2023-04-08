package factory_pattern;

public abstract class Pizza {
	
	abstract String setName();
	abstract String setDough();
	abstract String setSauce();
	
	void prepare(){
		System.out.println("Preparing:"+setName()+","+setDough()+
				","+setSauce());
	}
	void bake(){
		System.out.println("Bake for 25 minutes at 350");
	}
	void cut(){
		System.out.println("Cutting the pizza into diagonal slices");
	}
	void box(){
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public String getName(){
		return setName();
	}
	
}
