package singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/*
 * 测试懒汉单例模式，(如何防止反射和反序列化漏洞)
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
    
    //反序列化后，如果定义了readResolve（）则直接返回此方法指定的对象，而不需要单独再创建新对象
   private Object readResolve() throws ObjectStreamException{
    	return instance;
   }
}
