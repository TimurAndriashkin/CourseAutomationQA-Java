package first_package;

public class Star extends StarSystem {

	String nameOfStar;
	String introductionOfStar = "Hi, it's my introduction";

// Overload constructors but unrelated.
	public Star() {

	}

	public Star(String nameOfStar) {
		this.nameOfStar = nameOfStar;
	}

	public Star(String nameOfStar, String introductionOfStar) {
		this.nameOfStar = nameOfStar;
		this.introductionOfStar = introductionOfStar;

	}

	public void printNameOfStar() {
		System.out.println("Hi, my name is " + nameOfStar);
	}

	public void printIntroductionOfStar() {
		System.out.println(introductionOfStar);
	}

	public void setNameOfStar(String nameOfStar) {
		this.nameOfStar = nameOfStar;
	}

	@Override
	public void printAllInformation() {
		System.out.println("Hello, I'm Class Star. And i can tell you a little more about Sun and Sirius");

	}

	@Override
	public void printHello() {
		System.out.println("Hello from the Second abstract method (in the Star class)");

	}

}
