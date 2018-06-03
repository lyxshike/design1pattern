package mediator;

public class Development implements Department {

	private Mediator m; //�����н���(�ܾ���)������
	
	public Development(Mediator m){
		super();
		this.m = m;
		m.register("development", this);
	}
	@Override
	public void selfAction() {
		// TODO Auto-generated method stub
       System.out.println("ר�����з�");	
	}

	@Override
	public void outAction() {
		// TODO Auto-generated method stub
		System.out.println("�ϰ�Ǯ������");
		m.command("finacial");
	}
	
}
