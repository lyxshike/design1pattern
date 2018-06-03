package strategy;

public class Client {
	public static void main(String[] args) {
		Strategy strategy = new NewCustomerFewStrategy();
		Context c = new Context(strategy);
		c.sprintPrice(998);
	}
}
