package first_package;

import java.util.List;

public class Dropdown {

	List<String> options;
	boolean isSelected;
	String name;

	public Dropdown(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
