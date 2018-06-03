package flyweight;

//��Ԫ��
public interface ChessFlyWeight {
	void setColor(String s);
	String getColor();
	void display(Coordinate c);
}

class ConcreteChess implements ChessFlyWeight{
	private String color;

	public ConcreteChess(String color) {
		super();
		this.color = color;
	}

	@Override
	public void setColor(String s) {
		// TODO Auto-generated method stub
		this.color = color;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public void display(Coordinate c) {
		// TODO Auto-generated method stub
		System.out.println("���ӵ���ɫ"+color);
		System.out.println("���ӵ�λ��"+c.getX()+"---"+c.getY());
	}
	
	
}