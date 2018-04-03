package factory.factorymethod;

public class BenziCarFactory implements CarFactory {

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new Benzi();
	}

}
