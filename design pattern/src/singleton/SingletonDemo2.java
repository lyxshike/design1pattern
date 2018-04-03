package singleton;

/*
 * ÀÁººÄ£Ê½£¬
 * */
public class SingletonDemo2 {
    private static SingletonDemo2 instance;
    
    private SingletonDemo2(){}
    
    public synchronized static SingletonDemo2 getInstance(){
    	if(instance == null){
    		instance = new SingletonDemo2();
    	}
    	return instance;
    }
}
