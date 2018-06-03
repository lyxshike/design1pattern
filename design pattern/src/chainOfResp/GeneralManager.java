package chainOfResp;

//主任
public class GeneralManager extends Leader {

	public GeneralManager(String name) {
		super(name);
	}

	public void handleRequest(LeaveRequest request){
		if(request.getLeaveDays() < 30){
			System.out.println("员工"+request.getEmpName()+"请假,天数:"+request.getLeaveDays()+",理由:"+request.getReason());
	        System.out.println("总经理"+this.name+",审批通过！");
		}else{
			System.out.println(request.getEmpName()+"hi man 你想辞职啊");
		}
	}
}
