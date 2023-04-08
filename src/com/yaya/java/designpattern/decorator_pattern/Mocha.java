package decorator_pattern;

public class Mocha extends Condiment {

	private Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage=beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+",Mocha";
	}

	@Override
	public double cost() {
		return beverage.cost()+0.20;
	}

}
