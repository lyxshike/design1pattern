package command;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Command c = new ConcreteCommand(new Receiver());
	  	Invoke i = new Invoke(c);
        i.call();
        new Receiver().action();
	}

}
