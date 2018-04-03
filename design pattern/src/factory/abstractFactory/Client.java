package factory.abstractFactory;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory factory = new LuxuryFactory();
		Engine e = factory.createEngine();
		e.run();
		e.start();
	}

}
