package prototype;

import java.io.Serializable;
/*
 * 测试普通new方式创建对象和clone方法创建对象的效率差异
 * 如果需要短时间创建大量对象，并且new的过程比较耗时，则可以先考虑使用原型模式！！！
 * */

public class Client4 {

	/**
	 * @param args
	 */
	
	public static void testNew(int size){
        long start = System.currentTimeMillis();
		for(int i=0; i<size; i++){
			Laptop t = new Laptop();
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	
	public static void testClone(int size) throws CloneNotSupportedException{
        long start = System.currentTimeMillis();
        Laptop t = new Laptop();
		for(int i=0; i<size; i++){
			Laptop temp =  (Laptop) t.clone();
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		testNew(1000);
		testClone(1000);
	}
}

class Laptop implements Cloneable{
	public Laptop() {
		// TODO Auto-generated constructor stub
		try {
			Thread.sleep(10); //模拟创建对象耗时的过程
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Object obj = super.clone(); //直接调用object对象的clone()方法！
		return obj;
	}
}