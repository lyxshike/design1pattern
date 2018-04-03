package adapter;

/*
 * 适配器（类适配器的方式）
 * ，相当于usb和ps2的转换器
 * */
public class Adapter extends Adaptee implements Target{

	@Override
	public void handleReq() {
		// TODO Auto-generated method stub
		super.request();
	}

}
