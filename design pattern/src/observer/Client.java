package observer;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ŀ�����
		ConcreteSubject subject = new ConcreteSubject();
		//��������۲���
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();
		
		//���������۲�����ӵ�subject����Ĺ۲��߶�����
		
		subject.registerObserver(obs1);
		subject.registerObserver(obs2);
		subject.registerObserver(obs3);
		
		//�ı�subject��״̬
		subject.setState(3000);
		//�������������۲��ߵ�״̬�ǲ���Ҳ�����˱仯
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
	}

}
