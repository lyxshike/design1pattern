package builder;

public class SxtShipDirector implements AirShipDirector {

	private AirShipBuilder builder;
	
	
	public SxtShipDirector(AirShipBuilder builder) {
		super();
		this.builder = builder;
	}


	@Override
	public AirShip directAirShip() {
		// TODO Auto-generated method stub
		Engine e = builder.builderEngine();
		EscapeTower et =builder.builderEscapeTower();
		OrbitalMoudle om = builder.builderOrbitalMoudle();
		
		//装配成飞船对象
		AirShip  ship = new AirShip();
		ship.setEngine(e);
		ship.setEscapeTower(et);
		ship.setOrbitalMoudle(om);
		return ship;
	}

}
