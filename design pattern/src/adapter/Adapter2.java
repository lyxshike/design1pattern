package adapter;

/*
 * �������������������ķ�ʽ��ʹ������ϵķ�ʽ��������������ϣ�
 * ���൱��usb��ps2��ת����
 * */
public class Adapter2 implements Target{

	private Adaptee adaptee;
	@Override
	public void handleReq() {
		// TODO Auto-generated method stub
		adaptee.request();
	}
	
	public Adapter2(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
		// TODO Auto-generated constructor stub
	}

}
