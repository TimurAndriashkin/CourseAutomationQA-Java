package tasksLesson5;

public class Tester {
	private String name;
	private String surname;
	private int expirienceInYears;
	private String englishLevel;
	private int salary;

	public int getSalary() {
		return salary;
	}

	public Tester() {

	}

	public Tester(String name) {
		this.name = name;
	}

	public Tester(String name, String surname) {
		this(name);
		this.surname = surname;
	}

	public Tester(String name, String surname, int expirienceInYears) {
		this(name, surname);
		this.expirienceInYears = expirienceInYears;
	}

	public Tester(String name, String surname, int expirienceInYears, String englishLevel) {
		this(name, surname, expirienceInYears);
		this.englishLevel = englishLevel;
	}

	public Tester(String name, String surname, int expirienceInYears, String englishLevel, int salary) {
		this(name, surname, expirienceInYears, englishLevel);
		this.salary = salary;
	}

	public void changeTesterInformation(String name) {
		this.name = name;
	}

	public void changeTesterInformation(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public void changeTesterInformation(String name, String surname, int expirienceInYears) {
		this.name = name;
		this.surname = surname;
		this.expirienceInYears = expirienceInYears;
	}

	public void changeTesterInformation(String name, String surname, int expirienceInYears, String englishLevel) {
		this.name = name;
		this.surname = surname;
		this.expirienceInYears = expirienceInYears;
		this.englishLevel = englishLevel;
	}

	public static int printTesterSallaryWithoutTaxes(int salaryPerMonth) {
		return (int) (salaryPerMonth * 0.8);
	}

	public static void printTesterInformation(Tester tester) {
		System.out.println(tester);
	}

	@Override
	public String toString() {
		return String.format("Name - %s Surname - %s: Years expirience %d, english level - %s, salary - %d", this.name,
				this.surname, this.expirienceInYears, this.englishLevel, this.salary);
	}
}
