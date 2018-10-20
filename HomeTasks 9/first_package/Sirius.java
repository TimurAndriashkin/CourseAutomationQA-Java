package first_package;

public class Sirius extends Star {
	String typeOfStar = "Double Star";
	int massOfSirius = 2;

	public void printTypeOfStar() {
		System.out.println("Type of star: " + typeOfStar);
	}

	public void printMassOfSirius() {
		System.out.println("Mass of Sirius ~ " + massOfSirius + " mass of Sun");
	}

	@Override
	public void printAllInformation() {
		System.out.println("Hello, I'm Class Sirius. And i can tell you a little more about Sirius");

	}

	@Override
	public void printHello() {
		System.out.println("Hello from the Second abstract method (in the Sirius class)");

	}
}