package first_package;

public class ExampleMain {

	public static void main(String[] args) {
		// We can't create a instans of abstract class.
		// StarSystem starsystem = new StarSystem();

		Planet planet = new Planet();
		planet.printName(); // Method from StarSystem Class
		planet.printInformationAboutStarSystem(); // Method from StarSystem Class
		planet.setNameOfPlanet("Planet");
		planet.getNameOfPlanet();
		planet.setHasLife(true);
		planet.isHasLife();
		planet.printAllInformation();
		planet.printHello();

		System.out.println();

		Earth erth = new Earth();
		Earth earth1 = new Earth(15900);
		earth1.setNameOfPlanet("Saturn");
		earth1.setHasLife(false);
		System.out.println(earth1.getNameOfPlanet() + " " + earth1.isHasLife() + " " + earth1.radius);
		Earth earth2 = new Earth("Earth", 6371);
		earth2.setHasLife(true);
		earth2.printName(); // Method from StarSystem Class
		earth2.printInformationAboutStarSystem(); // Method from StarSystem Class
		earth2.printAllInformation();
		System.out.println(earth2.getNameOfPlanet() + " " + earth2.isHasLife());
		earth2.printSatellite();
		earth2.printRadius();
		earth2.printHello();

		System.out.println();

		Mars mars = new Mars();
		mars.setHasLife(true);
		mars.printName(); // Method from StarSystem Class
		mars.printInformationAboutStarSystem(); // Method from StarSystem Class
		mars.printAllInformation();
		mars.setNameOfPlanet("Mars");
		mars.setHasLife(false);
		System.out.println(mars.getNameOfPlanet() + " " + mars.isHasLife());
		System.out.println("Mars has " + mars.getNumberOfSatellites() + " satellites");
		mars.printAlias();
		mars.printHello();

		System.out.println();

		Star star = new Star("Moon");
		star.printName();
		star.printIntroductionOfStar();
		Star star1 = new Star("Diamond", "Hi, I'm Diamond Star, and i'm so pretty star");
		star1.printNameOfStar();
		star1.printIntroductionOfStar();
		star1.printAllInformation();
		star1.printHello();

		System.out.println();

		Sun sun = new Sun();
		sun.printAllInformation();
		sun.setNameOfStar("Sun");
		sun.printNameOfStar();
		sun.printRadiusOfSun();
		sun.printTemperatureOfSunCorona();
		sun.printHello();

		System.out.println();

		Sirius sirius = new Sirius();
		sirius.printAllInformation();
		sirius.setNameOfStar("Sirius");
		sirius.printNameOfStar();
		sirius.printTypeOfStar();
		sirius.printMassOfSirius();
		sirius.printHello();
	}

}
