package singleton;
/*
 * ��̬�ڲ��࣬ ���������أ��̰߳�ȫ������Ч�ʸ�
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
