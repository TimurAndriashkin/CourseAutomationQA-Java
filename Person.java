
public class Person {
	private String name;
	private String surname;
	private int age;
	private String phone;
	private boolean adult = isAdult();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void printAllInformation() {
		System.out.println("Person: " + getName() + " " + getSurname() + " " + getAge() + " " + getPhone());
	}

	public void printName() {
		System.out.println("Person: " + getName() + " " + getSurname());
	}

	public boolean isAdult() {
		if (this.age > 18) {
			this.adult = true;
		}
		return this.adult;
	}

}
