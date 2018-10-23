package second_package;

public class ReplaceLetters {
	InputText inputText = new InputText();
	Word word = new Word();
	Sentence sentence = new Sentence();

	public void replaceTextLetters() {
		inputText.inputTextFromKeyboard();

		Paragraph paragraph = Paragraph.getObjectOfParagraph(Paragraph.getAmountOfParagraphs());

		paragraphsToSentences(paragraph);

		sentence.stringToArrayOfWords();

		word.inputTextFromKeyboard();

		printTextBeforeModifying(paragraph);

		updateWordsInSentences();

		sentence.modifyStringOfParagraphs();

		paragraph.stringToArray(sentence.getStringOfParagraphs());

		printModifiedText(paragraph);

	}

	private void printTextBeforeModifying(Paragraph paragraph) {
		System.out.println("Text before modifying:");
		for (int i = 0; i < Paragraph.getAmountOfParagraphs(); i++) {
			System.out.print(paragraph.getParagraph(i));
		}
	}

	private void printModifiedText(Paragraph paragraph) {
		System.out.println("Text after modifying:");
		for (int i = 0; i < Paragraph.getAmountOfParagraphs(); i++) {
			System.out.println(paragraph.getParagraph(i));
		}
	}

	private void paragraphsToSentences(Paragraph paragraph) {

		for (int i = 0; i < Paragraph.getAmountOfParagraphs(); i++) {
			sentence.handleTextElement(paragraph.getParagraph(i));
		}
	}

	private void updateWordsInSentences() {
		int i = 0;
		for (String tempWord : sentence.getArrayOfWords()) {
			word.handleTextElement(tempWord);
			sentence.setWord(i, word.getTempWord().toString());
			i++;
		}
	}

}
