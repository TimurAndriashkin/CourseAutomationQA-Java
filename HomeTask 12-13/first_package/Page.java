package first_package;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Page {

	ArrayList<Button> buttons = new ArrayList<Button>();
	LinkedList<Field> fields = new LinkedList<Field>();
	HashSet<Label> labels = new HashSet<Label>();
	HashMap<Integer, Dropdown> dropdown = new HashMap<Integer, Dropdown>();

	float id;
	String title;

// Button

	public void addToCollection(Button button) {
		buttons.add(button);
	}

	public void removeFromCollection(Button button) {
		buttons.remove(button);
	}

	public void replaceFromCollection(int index, Button button) {
		buttons.set(index, button);
	}

	public void printButtonCollection() {
		buttons.stream().forEach(System.out::println);

// Field

	}

	public void addToCollection(Field field) {
		fields.add(field);
	}

	public void removeFromCollection(Field field) {
		fields.remove(field);
	}

	public void replaceFromCollection(int index, Field field) {
		fields.set(index, field);
	}

	public void printFieldCollection() {
		fields.stream().forEach(System.out::println);
	}

// Label

	public void addToCollection(Label label) {
		labels.add(label);
	}

	public void removeFromCollection(Label label) {
		labels.remove(label);
	}

	public void replaceFromCollection(Label oldLabel, Label newLabel) {
		labels.remove(oldLabel);
		labels.add(newLabel);
	}

	public void printLabelCollection() {
		labels.stream().forEach(System.out::println);
	}

// Dropdown

	public void addToCollection(int key, Dropdown value) {
		dropdown.put(key, value);
	}

	public void removeFromCollection(int key) {
		dropdown.remove(key);
	}

	@SuppressWarnings("unlikely-arg-type")
	public void removeFromCollection(Dropdown value) {
		dropdown.remove(value);
	}

	public void replaceFromCollection(int key, Dropdown obj) {
		dropdown.put(key, obj);
	}

	public void printDropdownCollection() {
		for (int key : dropdown.keySet()) {
			System.out.println("Key :" + key + ": \t " + dropdown.get(key));
		}
	}
}
