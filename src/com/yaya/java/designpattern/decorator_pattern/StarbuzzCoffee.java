package decorator_pattern;

/**
 * װ����ģʽ����̬�Ľ����η��䵽�����ϣ���Ҫ��չ���ܣ�װ�����ṩ�˱ȼ̳и��ɵ��Ե����������
 * ���磺Android�е�context��component�����ࣩ��contextImp�������������contextWrapper��װ���߼����ࣩ
 * @author ��С��
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
