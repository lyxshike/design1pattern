package builder;

//StringBuilder���append����,SQL�е�PreparedStatement,�Ժ�ѧϰXML�����У�JDOM���е���
public class SxtAirShipBuilder implements AirShipBuilder {

	@Override
	public Engine builderEngine() {
		// TODO Auto-generated method stub
		System.out.println("������ѧ�÷�����");
		return new Engine("��ѧ�÷�����");
	}

	@Override
	public OrbitalMoudle builderOrbitalMoudle() {
		// TODO Auto-generated method stub
		System.out.println("������ѧ�ù����");
		return new OrbitalMoudle("��ѧ�ù����");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		// TODO Auto-generated method stub
		System.out.println("������ѧ��������");
		return new EscapeTower("��ѧ��������");
	}
	
}
