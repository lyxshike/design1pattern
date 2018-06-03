package state;

public class CheckInState implements State{

	@Override
	public void handle() {
		System.out.println("房子已经入住，请勿打扰");
		
	}

}
