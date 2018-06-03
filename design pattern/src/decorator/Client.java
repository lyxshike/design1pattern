package decorator;

public class Client {
	public static void main(String[] args){
		ICar car = new Car();
		car.move();
		
		System.out.println("�����µĹ���,����~~~~~~~~~");
		ICar flyCar = new FlyCar(car);
		flyCar.move();
		
		System.out.println("�����µĹ���,��~~~~~~~~~");
		WaterCar waterCar = new WaterCar(car);
		waterCar.move();
		//car2.move();
		
		System.out.println("���������µĹ��ܣ����У�ˮ����");
		FlyCar flyCar2 = new FlyCar(new WaterCar(car));
		flyCar2.move();
		
		System.out.println("~~~~����3���µĹ��ܣ����У�ˮ���Σ�AI~~~~~~~~");
		FlyCar flyCar3 = new FlyCar(new WaterCar(new AICar(car)));
		flyCar3.move();
	}
}
