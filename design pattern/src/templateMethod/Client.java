package templateMethod;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stud
		//因为类是abstract,所以采用匿名内部类的方式 
		BankTemplateMethod bt = new BankTemplateMethod() {
			
			@Override
			public void transact() {
				System.out.println("我要存钱");
				
			}
		};
		
		bt.process();
	}

}
