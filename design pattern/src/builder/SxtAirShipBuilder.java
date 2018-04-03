package builder;

//StringBuilder类的append方法,SQL中的PreparedStatement,以后学习XML解析中，JDOM库中的类
public class SxtAirShipBuilder implements AirShipBuilder {

	@Override
	public Engine builderEngine() {
		// TODO Auto-generated method stub
		System.out.println("构造尚学堂发动机");
		return new Engine("尚学堂发动机");
	}

	@Override
	public OrbitalMoudle builderOrbitalMoudle() {
		// TODO Auto-generated method stub
		System.out.println("构造尚学堂轨道舱");
		return new OrbitalMoudle("尚学堂轨道舱");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		// TODO Auto-generated method stub
		System.out.println("构造尚学堂逃逸塔");
		return new EscapeTower("尚学堂逃逸塔");
	}
	
}
