package strategy;

public class OldCustomerFewStrategy implements Strategy {

	@Override
	public double getPrice(double price) {
		System.out.println("Дђ8ел");
		return price*0.8;
	}

}
