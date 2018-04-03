package proxy.staticProxy;

import proxy.dynamicProxy.Star;

public class ProxyStar implements Star {

	private Star star;
	
	
	public ProxyStar(Star star) {
		super();
		this.star = star;
	}

	@Override
	public void confer() {
		// TODO Auto-generated method stub
		System.out.println("ProxyStar.confer");
	}

	@Override
	public void signContract() {
		// TODO Auto-generated method stub
		System.out.println("ProxyStar.signContract");
	}

	@Override
	public void bookTicket() {
		// TODO Auto-generated method stub
		System.out.println("ProxyStar.bookTicket");
	}

	@Override
	public void sing() {
		star.sing();
	}

	@Override
	public void collectMoney() {
		// TODO Auto-generated method stub
		System.out.println("ProxyStar.collectMoney");
	}

}
