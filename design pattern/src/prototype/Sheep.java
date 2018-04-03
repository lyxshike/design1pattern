package prototype;

import java.io.Serializable;
import java.util.Date;

public class Sheep implements Cloneable, Serializable{
	private String sname;
	private Date birthday;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Object obj = super.clone(); //ֱ�ӵ���object�����clone()������
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

	public Sheep() {
		super();
	}

	public Sheep(String sname, Date birthday) {
		super();
		this.sname = sname;
		this.birthday = birthday;
	}
	
	
}
