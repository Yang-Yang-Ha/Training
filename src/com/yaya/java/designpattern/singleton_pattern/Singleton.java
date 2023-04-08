package singleton_pattern;

/*
 * ����ģʽ��ȷ��һ����ֻ��һ��ʵ�������ṩһ��ȫ�ַ��ʵ�
 */
public class Singleton {

	
	private Singleton(){
		
	}
	

	
/*	
 * ����ʽ������ÿ����Ҫʱ��ʵ����
 * private static Singleton singleton;
	public static Singleton getInstance(){
		if(singleton==null){
			singleton=new Singleton();
		}
		return singleton;
	}*/
/*	
 * ����ʽ���ڼ�����ʱ����
	private static Singleton singleton=new Singleton();
	public static Singleton getInstance(){
		return singleton;
	}*/
	
	//����ʽ���Ա�����̵߳��õı׶ˣ���������ʽ�����ԣ���ʹ������ʽ���е������ʱ����Ҫ�����Ż�����
	private static Singleton singleton;
	public static Singleton getInstance(){
		if(singleton==null){//�������getInstance�����ϼ�ͬ������������ʵ����֮��Ҫ����ͬ������
			synchronized(Singleton.class){
				if(singleton==null){
					singleton=new Singleton();
				}
			}
		}
		return singleton;
	}

}
