package prototype;

import java.util.Date;

//����ԭ��ģʽ(ǳ��¡)
public class Client {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Sheep s1 = new Sheep("����", new Date(12341234L));
		System.out.println(s1);
		
		Sheep s2 = (Sheep) s1.clone();
		System.out.println(s2);
		
		System.out.println(s1.getSname()+s1.getBirthday());
		System.out.println(s2.getSname()+s2.getBirthday());
	}

}
