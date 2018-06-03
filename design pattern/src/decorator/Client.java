package decorator;

public class Client {
	public static void main(String[] args){
		ICar car = new Car();
		car.move();
		
		System.out.println("增加新的功能,飞行~~~~~~~~~");
		ICar flyCar = new FlyCar(car);
		flyCar.move();
		
		System.out.println("增加新的功能,游~~~~~~~~~");
		WaterCar waterCar = new WaterCar(car);
		waterCar.move();
		//car2.move();
		
		System.out.println("增加两个新的功能，飞行，水里游");
		FlyCar flyCar2 = new FlyCar(new WaterCar(car));
		flyCar2.move();
		
		System.out.println("~~~~增加3个新的功能，飞行，水里游，AI~~~~~~~~");
		FlyCar flyCar3 = new FlyCar(new WaterCar(new AICar(car)));
		flyCar3.move();
	}
}
