package mediator;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mediator p = new President();
		Department d = new Development(p);
		Department m = new Market(p);
		Department f = new Finacial(p);
		
		//p.command("market");
		d.outAction();
	}

}
