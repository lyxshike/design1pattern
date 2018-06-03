package command;

public interface Command {
     void execute();//这个方法返回一个结果为空的方法，实际项目中，可以根据需求，设计多个不同的方法
}

class ConcreteCommand implements Command{

	private Receiver receiver;
	
	
	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}


	@Override
	public void execute() {
		//命令真正执行前后，执行相关的操作
		this.receiver.action();
		
	}
	
}