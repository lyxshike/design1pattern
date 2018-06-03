package strategy;

public class OldCustomerManyStrategy implements Strategy {

	@Override
	public double getPrice(double price) {
		System.out.println("Дђ7ел");
		return price*0.7;
	}

}
