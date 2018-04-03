package factory.simplefactory;

import factory.factorymethod.Car;

//简单工厂模式的情况下
public class Client02 {
	public static void main(String[] args){
		Car c1 =  CarFactory.createCar("比亚迪");
		Car c2 = CarFactory.createCar("奥迪");
		
		c1.run();
		c2.run();
		
		
		
	}
}
