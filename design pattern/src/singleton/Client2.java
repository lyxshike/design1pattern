package singleton;

import java.util.concurrent.CountDownLatch;

//���Զ��̻߳�����4�ִ�������ģʽ��Ч��
public class Client2 {
	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		int num = 10;
		final CountDownLatch countDownLatch = new CountDownLatch(num);
		for(int i =0; i < num; i++){
		new Thread(new Runnable(){
			public void run(){
				for(int i=0; i< 10000000; i++){
					Object o = SingletonDemo4.INSTANCE;	
				}
				countDownLatch.countDown();
			}
		}).start();
		}
		countDownLatch.await(); //main�߳�������ֱ����������Ϊ0���Ż��������ִ��
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
	}
}
