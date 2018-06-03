package bridge;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer2 c = new Laptop2(new Lenovo());
		c.sale();
	}

}
