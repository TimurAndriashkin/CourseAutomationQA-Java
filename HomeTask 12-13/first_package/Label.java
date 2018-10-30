package first_package;

public class Label {
	String name;

	public Label(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
