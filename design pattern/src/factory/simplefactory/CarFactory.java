package factory.simplefactory;

import factory.factorymethod.Audi;
import factory.factorymethod.Byd;
import factory.factorymethod.Car;

public class CarFactory {
	public static Car createCar(String type){
		if("°ÂµÏ".equals(type)){
			return new Audi();
		}else if("±ÈÑÇµÏ".equals(type)){
			return new Byd();
		} else {
			return null;
		}
		
	}
}
