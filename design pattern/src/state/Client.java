package state;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		State s = new FreeState();
		HomeContext hc = new HomeContext();
		hc.setState(s);
	}

}
