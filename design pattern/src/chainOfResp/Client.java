package chainOfResp;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leader a = new Director("张三");
		Leader b = new Manager("李四");
		Leader c = new GeneralManager("王五");
		Leader d = new ViceGeneralManager("sbGavin");  //副总经理
		
		a.setNextLeader(b);
		b.setNextLeader(d);
		d.setNextLeader(c);
		
		LeaveRequest lq = new LeaveRequest("alvin",16,"上厕所");
		a.handleRequest(lq);
	}

}
