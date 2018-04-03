package adapter;

/*
 * 适配器（对象适配器的方式，使用了组合的方式跟被适配对象整合）
 * ，相当于usb和ps2的转换器
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
