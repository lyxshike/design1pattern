package state;

public class BookedState implements State{

	@Override
	public void handle() {
		System.out.println("房子已经预定，等待入住");
		
	}

}
