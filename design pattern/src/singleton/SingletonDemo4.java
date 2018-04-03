package singleton;

/*
 * 枚举实现单例(没有懒加载)
 * */
public enum SingletonDemo4 {
	
	//这个枚举元素本身就是单例对象
	INSTANCE;
	
	//添加自己需要的操作
	public void singletonOperation(){}
}
