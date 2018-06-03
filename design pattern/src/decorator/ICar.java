package decorator;

public interface ICar {
	void move();
}

//ConcreteComponent ���幹����ɫ(��ʵ����)
class Car implements ICar{
	public void move(){
		System.out.println("½������");
	}
}

//Decorator װ�ν�ɫ
class SuperCar implements ICar{
	private ICar car;

	public SuperCar(ICar car) {
		super();
		this.car = car;
	}
	
	public void move(){
		car.move();
	}
}

class FlyCar extends SuperCar{
	public FlyCar(ICar car){
	     super(car);
	}
	
	public void fly(){
		System.out.println("���Ϸ�");
	}
	
	public void move(){
		super.move();
		fly();
	}
}

class WaterCar extends SuperCar{
	public WaterCar(ICar car){
	     super(car);
	}
	
	public void swim(){
		System.out.println("ˮ����");
	}
	
	public void move(){
		super.move();
		swim();
	}
}

class AICar extends SuperCar{
	public AICar(ICar car){
	     super(car);
	}
	
	public void calculate(){
		System.out.println("ͷ�Է籩");
	}
	
	public void move(){
		super.move();
		calculate();
	}
}