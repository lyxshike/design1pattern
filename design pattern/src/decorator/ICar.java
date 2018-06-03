package decorator;

public interface ICar {
	void move();
}

//ConcreteComponent 具体构建角色(真实对象)
class Car implements ICar{
	public void move(){
		System.out.println("陆地上跑");
	}
}

//Decorator 装饰角色
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
		System.out.println("天上飞");
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
		System.out.println("水中游");
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
		System.out.println("头脑风暴");
	}
	
	public void move(){
		super.move();
		calculate();
	}
}