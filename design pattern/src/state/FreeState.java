package state;

public class FreeState implements State{

	@Override
	public void handle() {
		System.out.println("房子空闲， 等待预定");
		
	}

}
