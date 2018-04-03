package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Client {
	public static void main(String[] args) throws Exception{
		
	
	SingletonDemo5 s1 = SingletonDemo5.getInstance();
	SingletonDemo5 s2 = SingletonDemo5.getInstance();
	
	System.out.println(s1);
	System.out.println(s2);
	
	/*   ͨ������ķ�ʽֱ�ӵ���˽�й�����
	Class<SingletonDemo5> clazz = (Class<SingletonDemo5>) Class.forName("singleton.SingletonDemo5");
	
	Constructor<SingletonDemo5> c = clazz.getDeclaredConstructor();
	
    c.setAccessible(true);
	SingletonDemo5 k1 = c.newInstance();
	
	SingletonDemo5 k2 = c.newInstance();
	
	System.out.println(k1);
	System.out.println(k2);
	*/
	
	//ͨ�������л��ķ�ʽ����������
	FileOutputStream fos = new FileOutputStream("D:/a.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(s1);
	oos.close();
	fos.close();
	
	FileInputStream fis = new FileInputStream("D:/a.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);
	SingletonDemo5 instance = (SingletonDemo5) ois.readObject();
	
	System.out.println(instance);
	fis.close();
	ois.close();
	}
}
