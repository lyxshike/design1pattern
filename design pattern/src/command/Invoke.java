package command;
//������/������
public class Invoke {
	private Command command;//Ҳ����ͨ������List<Command> ���ɺܶ�������󣬽����������������ݿ�ײ���������������ƵĽṹ

	public Invoke(Command command) {
		super();
		this.command = command;
	}
	
	//ҵ�񷽷������ڵ�������ķ���
	public void call(){
		System.out.println("�ӵ���");
		this.command.execute();
	}
}
