package factory.factorymethod;

public class Client {
	public static void main(String[] args){
		Car byd = new BydCarFactory().createCar();
		Car audi = new AudiCarFactory().createCar();
		Car benzi = new BenziCarFactory().createCar();
		byd.run();
		audi.run();
		benzi.run();
		
		
	}
}
