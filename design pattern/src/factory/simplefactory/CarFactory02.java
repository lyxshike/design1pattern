package factory.simplefactory;

import factory.factorymethod.Audi;
import factory.factorymethod.Byd;
import factory.factorymethod.Car;

public class CarFactory02 {
	public static Car createAudi(){
		return new Audi();
	}
	
	public static Car createByd(){
		return new Byd();
	}
}

