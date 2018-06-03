package chainOfResp;

//������
public abstract class Leader {
	protected String name;
	protected Leader nextLeader; //�������ϵĺ�̶���
	
	public Leader(String name) {
		super();
		this.name = name;
	}

	//�������ϵĺ�̶���
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
	
	//��������ĺ��ķ���
	public abstract void handleRequest(LeaveRequest request);
	
}
