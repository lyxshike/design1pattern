package state;

public class HomeContext {
	private State state;

	public void setState(State state) {
		System.out.println("�޸�״̬");
		this.state = state;
		state.handle();
	}
	
	
}
