package first_package;

public class Earth extends Planet {

	int radius;
	String satellite = "Moon";

	// Overload and related to each other constructors.
	public Earth() {

	}

	public Earth(int radius) {
		this.radius = radius;
	}

	public Earth(String nameOfPlanet, int radius) {
		this(radius);
		super.setNameOfPlanet(nameOfPlanet);

	}

	public void printSatellite() {
		System.out.println("Satellite: " + satellite);
	}

	public void printRadius() {
		System.out.println("Radius of Earth = " + radius);
	}

	@Override
	public void printAllInformation() {
		System.out.println("Hello, I'm Class Earth. And i can tell you a little more about Earth");

	}

	@Override
	public void printHello() {
		System.out.println("Hello from the Second abstract method (in the Earth class)");

	}
}
