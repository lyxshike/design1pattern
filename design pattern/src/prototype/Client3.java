package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

//ͨ�����л��ͷ����л�ʵ�����¡
public class Client3 {
	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
	    Date date = new Date(12341234L);
		Sheep s1 = new Sheep("����", date);
		
		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		
		//ʹ�����л��ͷ����л�ʵ�ָ��� 
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(s1);
		byte[] bytes = bos.toByteArray();
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Sheep s2 = (Sheep) ois.readObject();

		date.setTime(78907890L);
		System.out.println(s1.getBirthday());
		
		
		s2.setSname("����");
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
	}
}
