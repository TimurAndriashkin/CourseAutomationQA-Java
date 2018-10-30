package first_package;

public class Button {
	String name;
	boolean action;

	public Button(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
