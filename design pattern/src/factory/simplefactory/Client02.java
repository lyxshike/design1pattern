package factory.simplefactory;

import factory.factorymethod.Car;

//�򵥹���ģʽ�������
public class Client02 {
	public static void main(String[] args){
		Car c1 =  CarFactory.createCar("���ǵ�");
		Car c2 = CarFactory.createCar("�µ�");
		
		c1.run();
		c2.run();
		
		
		
	}
}
