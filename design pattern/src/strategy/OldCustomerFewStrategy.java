package strategy;

public class OldCustomerFewStrategy implements Strategy {

	@Override
	public double getPrice(double price) {
		System.out.println("��8��");
		return price*0.8;
	}

}
