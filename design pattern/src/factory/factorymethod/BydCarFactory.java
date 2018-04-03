package factory.factorymethod;

public class BydCarFactory implements CarFactory{

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new Byd();
	}
	
}
