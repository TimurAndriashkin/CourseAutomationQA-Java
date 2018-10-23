package second_package;

import java.util.Scanner;

abstract class InputMethods {

	private Scanner input;

	InputMethods() {
		input = new Scanner(System.in);
	}

	void closeInput() {
		input.close();
	}

	Scanner getInput() {
		return input;
	}

	abstract void inputTextFromKeyboard();

}
