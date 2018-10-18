package first_package;

public class TesterMain {

	public static void main(String[] args) {
		Tester tester = new Tester("Tim", "Richards", 11, "Advance", 3060);
		tester.printTesterInformation(tester);
	// Methods from task2
		tester.setName("Timur");
		System.out.println(tester.getName());
		tester.setSurname("Andriashkin");
		System.out.println(tester.getSurname());
		tester.setExpirienceInYears(1);
		System.out.println(tester.getExpirienceInYears());
		tester.setEnglishLevel("Intermediate");
		System.out.println(tester.getEnglishLevel());
		tester.setSalary(700);
		System.out.println(tester.getSalary());

	//Method from task 3 can NOT be used in the other classes because it's private method of Tester class'.
		
		//System.out.println("Double salary = " + tester.returnDoubleSalary(tester.getSalary()));

	// Method from task 4

		System.out.println("Expirience in months = " + tester.returnExpirienceInMonths(tester.getExpirienceInYears()));

	// Method from task 5

		tester.printNameAndSurname(tester.getName(), tester.getSurname());

	// Method from task 6
		tester.printTesterInformation(tester);
	}
}
