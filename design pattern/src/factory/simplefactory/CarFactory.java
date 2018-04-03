package factory.simplefactory;

import factory.factorymethod.Audi;
import factory.factorymethod.Byd;
import factory.factorymethod.Car;

public class CarFactory {
	public static Car createCar(String type){
		if("�µ�".equals(type)){
			return new Audi();
		}else if("���ǵ�".equals(type)){
			return new Byd();
		} else {
			return null;
		}
		
	}
}
