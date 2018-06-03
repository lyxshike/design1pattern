package bridge;

public interface Brand {
	public void sale();
}

class Lenovo implements Brand{
	public void sale(){
		System.out.println("销售联想");
	}
}

class Dell implements Brand{
	public void sale(){
		System.out.println("销售Dell");
	}
}