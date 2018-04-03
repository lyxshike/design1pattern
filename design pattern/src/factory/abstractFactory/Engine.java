package factory.abstractFactory;

public interface Engine {
	void start();
	void run();
}

class LuxuryEngine implements Engine{

@Override
public void start() {
	// TODO Auto-generated method stub
	System.out.println("启动快");
}

@Override
public void run() {
	// TODO Auto-generated method stub
	System.out.println("跑的快，可以自动启停");
}
}


class LowEngine implements Engine{

@Override
public void start() {
	// TODO Auto-generated method stub
	System.out.println("启动慢");
}

@Override
public void run() {
	// TODO Auto-generated method stub
	System.out.println("跑的慢");
}
}
