package templateMethod;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stud
		//��Ϊ����abstract,���Բ��������ڲ���ķ�ʽ 
		BankTemplateMethod bt = new BankTemplateMethod() {
			
			@Override
			public void transact() {
				System.out.println("��Ҫ��Ǯ");
				
			}
		};
		
		bt.process();
	}

}
