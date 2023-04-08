package template_method_pattern;

public abstract class CaffeineBeverageWithHook {
	
	void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments())
			addCondiments();
	}
	
	void boilWater(){
		
	}

	abstract void brew();
	
	void pourInCup(){
		
	}
	
	boolean customerWantsCondiments(){
		return true;
	}
	
	abstract void addCondiments();
}
