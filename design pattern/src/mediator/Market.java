package mediator;

public class Market implements Department {

	private Mediator m; //�����н���(�ܾ���)������
	
	public Market(Mediator m){
		super();
		this.m = m;
		m.register("market", this);
	}
	@Override
	public void selfAction() {
		// TODO Auto-generated method stub
       	
       System.out.println("��ȥ����Ŀ");
	}

	@Override
	public void outAction() {
		// TODO Auto-generated method stub
		
		System.out.println("�㱨��������Ŀ�ĳнӽ��ȣ���Ҫ�ʽ�֧��");
	}
	
}
