package mediator;

public class Finacial implements Department {

	private Mediator m; //�����н���(�ܾ���)������
	
	public Finacial(Mediator m){
		super();
		this.m = m;
		m.register("finacial", this);
	}
	@Override
	public void selfAction() {
		// TODO Auto-generated method stub
		System.out.println("��Ǯ");	
	}

	@Override
	public void outAction() {
		// TODO Auto-generated method stub
		System.out.println("Ǯ��ģ�û����");
	}
	
}
