package strategy;

public class OldCustomerManyStrategy implements Strategy {

	@Override
	public double getPrice(double price) {
		System.out.println("��7��");
		return price*0.7;
	}

}
