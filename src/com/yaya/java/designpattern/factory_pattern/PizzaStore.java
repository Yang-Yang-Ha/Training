package factory_pattern;

public abstract class PizzaStore {

	//简单工厂模式
/*	private SimplePizzaFactory mFactory;
	public PizzaStore(SimplePizzaFactory factory){
		mFactory=factory;
	}*/
	
	public Pizza orderPizza(String type){
		Pizza pizza;
		pizza=createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	/*
	 * 工厂方法模式
	 * 当要给分店一些自由度时，可以把创建pizza方法放到
	 * pizzaStore的对象之中。
	 */
	abstract Pizza createPizza(String type);
	
	/*
	 * 还有一种抽象工厂模式，定义一个接口或者抽象类，用语创建相关的依赖对象的家族
	 * 而不用明确指定具体类
	 */
}
