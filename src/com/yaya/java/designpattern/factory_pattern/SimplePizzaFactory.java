package factory_pattern;

public class SimplePizzaFactory {
	
	/*
	 * ������Ҫ�����˵�̫������ɶ�ʱ��������������pizza�Ĺ���
	 * ���ǣ��򵥹���ģʽ
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
