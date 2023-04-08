package factory_pattern;

public class NYStyleCheesePizza extends Pizza {

	@Override
	String setName() {
		return "NY Style Sauce and Cheese Pizza";
	}

	@Override
	String setDough() {
		return "Thin Crust Dough";
	}

	@Override
	String setSauce() {
		return "Marinara Sauce";
	}

}
