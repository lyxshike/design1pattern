package observer;

public class ObserverA implements Observer {

	private int myState;//mystate��Ҫ��Ŀ������state����һ��
	@Override
	public void update(Subject subject) {
		// TODO Auto-generated method stub
		myState = ((ConcreteSubject)subject).getState();
	}
	public int getMyState() {
		return myState;
	}
	public void setMyState(int myState) {
		this.myState = myState;
	}

	
}
