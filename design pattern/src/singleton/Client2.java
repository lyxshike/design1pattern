package singleton;

import java.util.concurrent.CountDownLatch;

//测试多线程环境下4种创建单例模式的效率
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
		countDownLatch.await(); //main线程阻塞，直到计数器变为0，才会继续往下执行
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
	}
}
