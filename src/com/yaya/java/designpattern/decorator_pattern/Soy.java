package decorator_pattern;

public class Soy extends Condiment {

	private Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage=beverage;
	}
	
	@Override
	public String getDescription() {		
		return beverage.getDescription()+"soy";
	}

	@Override
	public double cost() {
		double cost=beverage.cost();
		switch (beverage.getSize()) {
			case Beverage.TALL:
				cost+=0.10;
				break;
			case Beverage.GRANDE:
				cost+=0.15;
				break;
			case Beverage.VENTI:
				cost+=0.20;
				break;
			default:
				break;
		}
		return cost;
	}

}
