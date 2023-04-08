package factory_pattern;

public class SimplePizzaFactory {
	
	/*
	 * 当不需要给加盟店太多的自由度时，可以这样建造pizza的工厂
	 * 这是：简单工厂模式
	 */
	
	public Pizza createPizza(String type){
		Pizza pizza=null;
		switch(type){
		case "cheese":
			break;
		case "pepperoni":
			break;
		case "clam":
			break;
		case "veggie":
			break;
		}
		return pizza;
	}
}
