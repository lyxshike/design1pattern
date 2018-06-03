package strategy;

public class NewCustomerManyStrategy implements Strategy {

	@Override
	public double getPrice(double price) {
		System.out.println("Дђ9ел");
		return price*0.9;
	}

}
