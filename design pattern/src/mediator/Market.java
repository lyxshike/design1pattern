package mediator;

public class Market implements Department {

	private Mediator m; //持有中介者(总经理)的引用
	
	public Market(Mediator m){
		super();
		this.m = m;
		m.register("market", this);
	}
	@Override
	public void selfAction() {
		// TODO Auto-generated method stub
       	
       System.out.println("抛去接项目");
	}

	@Override
	public void outAction() {
		// TODO Auto-generated method stub
		
		System.out.println("汇报工作，项目的承接进度，需要资金支持");
	}
	
}
