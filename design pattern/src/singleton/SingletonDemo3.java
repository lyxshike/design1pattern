package singleton;
/*
 * 静态内部类， 满足懒加载，线程安全，调用效率高
 * */
public class SingletonDemo3 {
	private static class Instance{
		private static SingletonDemo3 instance = new SingletonDemo3();
	}
	
	private SingletonDemo3(){}
	
	public static SingletonDemo3 getInstance(){
		return Instance.instance;
	}
}
