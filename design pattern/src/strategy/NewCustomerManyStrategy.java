package strategy;

public class NewCustomerManyStrategy implements Strategy {

	@Override
	public double getPrice(double price) {
		System.out.println("��9��");
		return price*0.9;
	}

}
