package prototype;

import java.util.Date;

//实现深复制,就是把所有的属性也copy一份
public class Sheep2 implements Cloneable{
	private String sname;
	private Date birthday;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Object obj = super.clone(); //直接调用object对象的clone()方法！
		
		//添加如下代码，实现深复制 
		Sheep2 s = (Sheep2) obj;
		s.birthday = (Date) this.birthday.clone();
		
		
		return obj;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Sheep2() {
		super();
	}

	public Sheep2(String sname, Date birthday) {
		super();
		this.sname = sname;
		this.birthday = birthday;
	}
	
	
}
