package singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/*
 * ������������ģʽ��(��η�ֹ����ͷ����л�©��)
 * */
public class SingletonDemo5 implements Serializable {
    private static SingletonDemo5 instance;
    
    private SingletonDemo5(){
    	if(instance != null){
    		throw new RuntimeException();
    	}
    }
    
    public synchronized static SingletonDemo5 getInstance(){
    	if(instance == null){
    		instance = new SingletonDemo5();
    	}
    	return instance;
    }
    
    //�����л������������readResolve������ֱ�ӷ��ش˷���ָ���Ķ��󣬶�����Ҫ�����ٴ����¶���
   private Object readResolve() throws ObjectStreamException{
    	return instance;
   }
}
