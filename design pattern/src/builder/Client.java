package builder;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirShipDirector director = new SxtShipDirector(new SxtAirShipBuilder());
        AirShip airShip = director.directAirShip();	
        System.out.println(airShip.getEngine());
        airShip.launch();
	}

}
