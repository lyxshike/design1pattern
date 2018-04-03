package proxy.dynamicProxy;

import java.lang.reflect.Proxy;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Star realStar = new RealStar();
		
		StarHandler handler = new StarHandler(realStar);
		
		//proxy对象实现了star接口，其中的方法实际是调用handler.invoke(realStar.)
		Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), 
				new Class[]{Star.class}, handler);
		
		proxy.sing();
	}

}
