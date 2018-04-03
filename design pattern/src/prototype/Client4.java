package prototype;

import java.io.Serializable;
/*
 * ������ͨnew��ʽ���������clone�������������Ч�ʲ���
 * �����Ҫ��ʱ�䴴���������󣬲���new�Ĺ��̱ȽϺ�ʱ��������ȿ���ʹ��ԭ��ģʽ������
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
			Thread.sleep(10); //ģ�ⴴ�������ʱ�Ĺ���
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Object obj = super.clone(); //ֱ�ӵ���object�����clone()������
		return obj;
	}
}