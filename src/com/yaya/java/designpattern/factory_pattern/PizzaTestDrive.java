package factory_pattern;

/*
 * ���й���ģʽ��������װ����Ĵ�������������ģʽ��Factory Method Pattern��
 * ͨ������������ô����Ķ�����ʲô�����ﵽ�����󴴽��Ĺ��̷�װ��Ŀ�ģ�
 * 
 * ��������ģʽ:������һ����������Ľ�ڣ������������Ҫʵ������������һ������������
 * �����ʵ�����Ƴٵ�����
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());
    }

}
