package chainOfResp;

//����
public class ViceGeneralManager extends Leader {

	public ViceGeneralManager(String name) {
		super(name);
	}

	public void handleRequest(LeaveRequest request){
		if(request.getLeaveDays() < 20){
			System.out.println("Ա��"+request.getEmpName()+"���,����:"+request.getLeaveDays()+",����:"+request.getReason());
	        System.out.println("���ܾ���"+this.name+",����ͨ����");
		}else{
			if(this.nextLeader != null){
				this.nextLeader.handleRequest(request);
			}
		}
	}
}
