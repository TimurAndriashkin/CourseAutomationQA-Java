package third_package;

public class AdditionalTester {

	String text;

	private AdditionalTester() {
		System.out.println("I'm default private constructor");
	}

	private static AdditionalTester tester;

	public static AdditionalTester getObjectOfAdditionalTester() {
		if (tester == null) {
			tester = new AdditionalTester();
		}
		return tester;
	}

	public void printText() {
		System.out.println("Hello world");
	}
}
