package second_package;

class InputText extends InputMethods {

	InputText() {
		super();
	}

	void inputTextFromKeyboard() {

		System.out.println("Enter amount of paragraphs: ");
		Paragraph paragraph = Paragraph.getObjectOfParagraph(Integer.parseInt(getInput().nextLine()));

		for (int i = 0; i < Paragraph.getAmountOfParagraphs(); i++) {
			System.out.println("Enter " + (i + 1) + " paragraph:");
			paragraph.setParagraph(i, (getInput().nextLine() + "\n"));
		}

	}

}
