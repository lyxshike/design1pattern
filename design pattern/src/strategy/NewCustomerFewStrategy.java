package strategy;

public class NewCustomerFewStrategy implements Strategy {

	@Override
	public double getPrice(double price) {
		System.out.println("������");
		return price;
	}

}
