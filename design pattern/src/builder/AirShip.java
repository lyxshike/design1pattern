package builder;

public class AirShip {
	private OrbitalMoudle orbitalMoudle;  //轨道舱
	private Engine engine;         //发动机 
	private EscapeTower escapeTower;    //逃逸塔
	
	public void launch(){
		System.out.println("发射");
	}
	public OrbitalMoudle getOrbitalMoudle() {
		return orbitalMoudle;
	}
	public void setOrbitalMoudle(OrbitalMoudle orbitalMoudle) {
		this.orbitalMoudle = orbitalMoudle;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public EscapeTower getEscapeTower() {
		return escapeTower;
	}
	public void setEscapeTower(EscapeTower escapeTower) {
		this.escapeTower = escapeTower;
	}
	
}

class OrbitalMoudle{
	private String name;

	public OrbitalMoudle(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Engine{
	private String Engine;

	public String getEngine() {
		return Engine;
	}

	public void setEngine(String engine) {
		Engine = engine;
	}

	public Engine(String engine) {
		super();
		Engine = engine;
	}

}

class EscapeTower{
	private String escapeTower;

	public String getEscapeTower() {
		return escapeTower;
	}

	public void setEscapeTower(String escapeTower) {
		this.escapeTower = escapeTower;
	}

	public EscapeTower(String escapeTower) {
		super();
		this.escapeTower = escapeTower;
	}

}
