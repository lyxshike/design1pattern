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
		
		//proxy����ʵ����star�ӿڣ����еķ���ʵ���ǵ���handler.invoke(realStar.)
		Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), 
				new Class[]{Star.class}, handler);
		
		proxy.sing();
	}

}
