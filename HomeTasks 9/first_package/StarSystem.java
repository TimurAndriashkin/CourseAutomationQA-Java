package first_package;

public abstract class StarSystem {

	private String name = "Star system";
	private String informationAboutStarSystem = "A star system or stellar system is a small number of stars that orbit each other, bound by gravitational attraction.";

	public abstract void printAllInformation();
	public abstract void printHello();

	public void printName() {
		System.out.println(name);
	}

	public void printInformationAboutStarSystem() {
		System.out.println(informationAboutStarSystem);
	}
}
