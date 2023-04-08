package factory_pattern;

public abstract class PizzaStore {

	//�򵥹���ģʽ
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
	 * ��������ģʽ
	 * ��Ҫ���ֵ�һЩ���ɶ�ʱ�����԰Ѵ���pizza�����ŵ�
	 * pizzaStore�Ķ���֮�С�
	 */
	abstract Pizza createPizza(String type);
	
	/*
	 * ����һ�ֳ��󹤳�ģʽ������һ���ӿڻ��߳����࣬���ﴴ����ص���������ļ���
	 * ��������ȷָ��������
	 */
}
