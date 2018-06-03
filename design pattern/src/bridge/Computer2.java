package bridge;

public class Computer2 {
	protected Brand brand;
	public Computer2(Brand brand){
		this.brand = brand;
	}
	public void sale(){
		brand.sale();
	}
}

class Desktop2 extends Computer2{
	public Desktop2(Brand b){
		super(b);
	}
	public void sale(){
		super.sale();
		System.out.println("����̨ʽ��");
	}
}

class Laptop2 extends Computer2{
	public Laptop2(Brand b){
		super(b);
	}
	public void sale(){
		super.sale();
		System.out.println("���۱ʼǱ�");
	}
}