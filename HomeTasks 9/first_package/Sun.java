package first_package;

public class Sun extends Star {
	int radius = 695700;
	int temperatureOfSunCorona = 1500000;

	public void printRadiusOfSun() {
		System.out.println("Radius of Sun = " + radius + " km");
	}

	public void printTemperatureOfSunCorona() {
		System.out.println("Temperature of Sun Corona's = " + temperatureOfSunCorona + " K");
	}

	@Override
	public void printAllInformation() {
		System.out.println("Hello, I'm Class Sun. And i can tell you a little more about Sun");

	}

	@Override
	public void printHello() {
		System.out.println("Hello from the Second abstract method (in the Sun class)");

	}
}
