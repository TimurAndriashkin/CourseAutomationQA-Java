package second_package;

public class Word extends InputMethods implements IText {
	private final static String LETTERS_PATTERN = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private StringBuilder tempWord = new StringBuilder();
	private int indexToReplace;
	private char symbolToReplace;

	Word() {
		super();
	}

	private void setIndexToReplace(int indexToReplace) {
		this.indexToReplace = indexToReplace;
	}

	private void setSymbolToReplace(char symbolToReplace) {
		this.symbolToReplace = symbolToReplace;
	}

	private boolean isLetter(char symbolToVerify) {
		for (int i = 0; i < LETTERS_PATTERN.length(); i++) {
			if (symbolToVerify == LETTERS_PATTERN.charAt(i)) {
				return true;
			}
		}
		return false;
	}

	StringBuilder getTempWord() {
		return this.tempWord;
	}

	@Override
	void inputTextFromKeyboard() {
		System.out.println("Enter position to replace:");
		setIndexToReplace(Integer.parseInt(getInput().nextLine()) - 1);
		System.out.println("Enter symbol to replace:");
		setSymbolToReplace(getInput().nextLine().charAt(0));
		closeInput();

	}

	@Override
	public void handleTextElement(String tempTextElement) {
		tempWord.setLength(0);
		tempWord.append(tempTextElement);
		if (tempTextElement.length() > indexToReplace) {
			if (isLetter(tempTextElement.charAt(indexToReplace))) {
				tempWord.setCharAt(indexToReplace, symbolToReplace);
			}

		}
	}

}
