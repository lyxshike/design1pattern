package bridge;

public interface Brand {
	public void sale();
}

class Lenovo implements Brand{
	public void sale(){
		System.out.println("��������");
	}
}

class Dell implements Brand{
	public void sale(){
		System.out.println("����Dell");
	}
}