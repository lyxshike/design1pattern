package adapter;

/*
 * 客户端， 相当于例子中的笔记本，只有USB接口
 * */
public class Client {

	public void test1(Target t){
		t.handleReq();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Client c = new Client();
		Adaptee a = new Adaptee();
		Target t = new Adapter2(a);
		c.test1(t);
	}

}
