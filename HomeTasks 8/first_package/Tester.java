package first_package;

public class Tester {
	public String name;
	public String surname;
	protected int expirienceInYears;
	String englishLevel;
	private int salary;

	public Tester() {

	}

	public Tester(String name, String surname, int expirienceInYears) {
		this.name = name;
		this.surname = surname;
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

	private int returnDoubleSalary(int salary) {
		int multiply = 2;
		return salary * multiply;
	}

	int returnExpirienceInMonths(int expirienceInYears) {
		int multiply = 12;
		return expirienceInYears * multiply;
	}

	protected void printNameAndSurname(String name, String surname) {
		System.out.println(name + " " + surname);
	}

	public void printTesterInformation(Tester tester) {
		System.out.println(tester);
	}

	@Override
	public String toString() {
		return String.format("Name - %s Surname - %s: Years expirience %d, english level - %s, salary - %d", this.name,
				this.surname, this.expirienceInYears, this.englishLevel, this.salary);
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getSurname() {
		return surname;
	}

	void setSurname(String surname) {
		this.surname = surname;
	}

	int getExpirienceInYears() {
		return expirienceInYears;
	}

	void setExpirienceInYears(int expirienceInYears) {
		this.expirienceInYears = expirienceInYears;
	}

	String getEnglishLevel() {
		return englishLevel;
	}

	void setEnglishLevel(String englishLevel) {
		this.englishLevel = englishLevel;
	}

	int getSalary() {
		return salary;
	}

	void setSalary(int salary) {
		this.salary = salary;
	}

}
