package mediator;

public class Development implements Department {

	private Mediator m; //持有中介者(总经理)的引用
	
	public Development(Mediator m){
		super();
		this.m = m;
		m.register("development", this);
	}
	@Override
	public void selfAction() {
		// TODO Auto-generated method stub
       System.out.println("专心做研发");	
	}

	@Override
	public void outAction() {
		// TODO Auto-generated method stub
		System.out.println("老板钱不够了");
		m.command("finacial");
	}
	
}
