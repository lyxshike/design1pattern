package command;

public interface Command {
     void execute();//�����������һ�����Ϊ�յķ�����ʵ����Ŀ�У����Ը���������ƶ����ͬ�ķ���
}

class ConcreteCommand implements Command{

	private Receiver receiver;
	
	
	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}


	@Override
	public void execute() {
		//��������ִ��ǰ��ִ����صĲ���
		this.receiver.action();
		
	}
	
}