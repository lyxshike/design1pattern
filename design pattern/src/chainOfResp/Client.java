package chainOfResp;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leader a = new Director("����");
		Leader b = new Manager("����");
		Leader c = new GeneralManager("����");
		Leader d = new ViceGeneralManager("sbGavin");  //���ܾ���
		
		a.setNextLeader(b);
		b.setNextLeader(d);
		d.setNextLeader(c);
		
		LeaveRequest lq = new LeaveRequest("alvin",16,"�ϲ���");
		a.handleRequest(lq);
	}

}
