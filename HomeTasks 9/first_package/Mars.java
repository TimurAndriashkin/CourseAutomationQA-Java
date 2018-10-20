package first_package;

public class Mars extends Planet {

	String[] satellitesOfMars = { "Deimos", "Phobos" };
	String aliasOfMars = "Red Planet";

	public void printAlias() {
		System.out.println("In English, Mars carries a name of the Roman god of war, and is often referred to as the "
				+ aliasOfMars);
	}

	public int getNumberOfSatellites() {
		return satellitesOfMars.length;
	}

	@Override
	public void printAllInformation() {
		System.out.println("Hello, I'm Class Mars. And i can tell you a little more about Mars");

	}

	@Override
	public void printHello() {
		System.out.println("Hello from the Second abstract method (in the Mars class)");

	}
}
