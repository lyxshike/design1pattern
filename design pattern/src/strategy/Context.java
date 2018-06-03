package strategy;

public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void sprintPrice(double standPrice){

		System.out.println(strategy.getPrice(standPrice));
	}
}
