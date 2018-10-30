package first_package;

public class Field {
	int id;
	String value;

	public Field(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return this.value;
	}
}
