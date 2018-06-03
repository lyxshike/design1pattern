package bridge;

public interface Computer{
	void sale();
}

class Desktop implements Computer{
	public void sale() {
		System.out.println("�����������");
	}
}
class Laptop implements Computer{
	public void sale() {
		System.out.println("���۱ʼǱ�����");
	}
}
class Pad implements Computer{
	public void sale(){
		System.out.println("����pad");
	}
}

class LenovoDesktop extends Desktop{
	public void sale(){
		System.out.println("��������̨ʽ����");
	}
}

class LenovoLaptop extends Laptop{
	public void sale(){
		System.out.println("��������ʼǱ�����");
	}
}

class LenovoPad extends Pad{
	public void sale(){
		System.out.println("��������ƽ��");
	}
}

class DellDesktop extends Desktop{
	public void sale(){
		System.out.println("���۴���̨ʽ����");
	}
}

class DellLaptop extends Laptop{
	public void sale(){
		System.out.println("���۴����ʼǱ�����");
	}
}

class DellPad extends Pad{
	public void sale(){
		System.out.println("���۴���ƽ��");
	}
}