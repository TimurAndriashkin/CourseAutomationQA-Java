package first_package;

public class Planet extends StarSystem {

	private String nameOfPlanet;
	boolean hasLife;

	String getNameOfPlanet() {
		return nameOfPlanet;
	}

	public void setNameOfPlanet(String nameOfPlanet) {
		this.nameOfPlanet = nameOfPlanet;
	}

	public boolean isHasLife() {
		return hasLife;
	}

	public void setHasLife(boolean hasLife) {
		this.hasLife = hasLife;
	}

	@Override
	public void printAllInformation() {
		System.out.println("Hello, I'm Class Planet. And i can tell you a little more about Earth and Mars");

	}

	@Override
	public void printHello() {
		System.out.println("Hello from the Second abstract method (in the Planet Class)");
	}

}
