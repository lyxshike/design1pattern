package factory.abstractFactory;

public interface Engine {
	void start();
	void run();
}

class LuxuryEngine implements Engine{

@Override
public void start() {
	// TODO Auto-generated method stub
	System.out.println("������");
}

@Override
public void run() {
	// TODO Auto-generated method stub
	System.out.println("�ܵĿ죬�����Զ���ͣ");
}
}


class LowEngine implements Engine{

@Override
public void start() {
	// TODO Auto-generated method stub
	System.out.println("������");
}

@Override
public void run() {
	// TODO Auto-generated method stub
	System.out.println("�ܵ���");
}
}
