package decorator_pattern;

/**
 * 装饰者模式：动态的讲责任分配到对象上，若要扩展功能，装饰者提供了比继承根由弹性的替代方案。
 * 例如：Android中的context（component抽象类），contextImp（具体组件），contextWrapper（装饰者集成类）
 * @author 杨小过
 *
 */
public class StarbuzzCoffee {

	public static void main(String[] args) {
		Beverage beverage=new Espresso();
		System.out.println(beverage.getDescription()+"$"+beverage.cost());
		
		beverage=new Mocha(beverage);
		beverage=new Mocha(beverage);
		System.out.println(beverage.getDescription()+"$"+beverage.cost());
		
		Beverage beverage1=new HouseBlend();
		beverage1=new Mocha(beverage1);
		System.out.println(beverage1.getDescription()+"$"+beverage1.cost()+beverage1.getSize());
		
		
	}

}
