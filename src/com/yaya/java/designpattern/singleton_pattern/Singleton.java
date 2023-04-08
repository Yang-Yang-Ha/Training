package singleton_pattern;

/*
 * 单例模式，确保一个类只有一个实例，并提供一个全局访问点
 */
public class Singleton {

	
	private Singleton(){
		
	}
	

	
/*	
 * 懒汉式单利，每次需要时在实例化
 * private static Singleton singleton;
	public static Singleton getInstance(){
		if(singleton==null){
			singleton=new Singleton();
		}
		return singleton;
	}*/
/*	
 * 饿汉式，在加载类时创建
	private static Singleton singleton=new Singleton();
	public static Singleton getInstance(){
		return singleton;
	}*/
	
	//饿汉式可以避免多线程调用的弊端，但是懒汉式不可以，当使用懒汉式进行单例设计时，休要进行优化如下
	private static Singleton singleton;
	public static Singleton getInstance(){
		if(singleton==null){//相比于在getInstance方法上加同步锁，以免在实例化之后还要进行同步检验
			synchronized(Singleton.class){
				if(singleton==null){
					singleton=new Singleton();
				}
			}
		}
		return singleton;
	}

}
