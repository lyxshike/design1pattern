package bridge;

public interface Computer{
	void sale();
}

class Desktop implements Computer{
	public void sale() {
		System.out.println("销售桌面电脑");
	}
}
class Laptop implements Computer{
	public void sale() {
		System.out.println("销售笔记本电脑");
	}
}
class Pad implements Computer{
	public void sale(){
		System.out.println("销售pad");
	}
}

class LenovoDesktop extends Desktop{
	public void sale(){
		System.out.println("销售联想台式电脑");
	}
}

class LenovoLaptop extends Laptop{
	public void sale(){
		System.out.println("销售联想笔记本电脑");
	}
}

class LenovoPad extends Pad{
	public void sale(){
		System.out.println("销售联想平板");
	}
}

class DellDesktop extends Desktop{
	public void sale(){
		System.out.println("销售戴尔台式电脑");
	}
}

class DellLaptop extends Laptop{
	public void sale(){
		System.out.println("销售戴尔笔记本电脑");
	}
}

class DellPad extends Pad{
	public void sale(){
		System.out.println("销售戴尔平板");
	}
}