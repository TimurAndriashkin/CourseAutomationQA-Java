package second_package;

class Paragraph {

	private static String[] arrayOfParagraphs;

	private static Paragraph paragraph;

	private Paragraph(int amountOfParagraphs) {
		arrayOfParagraphs = new String[amountOfParagraphs];
	}

	static Paragraph getObjectOfParagraph(int amountOfParagraphs) {
		if (paragraph == null) {
			paragraph = new Paragraph(amountOfParagraphs);
		}
		return paragraph;
	}

	String getParagraph(int index) {
		return arrayOfParagraphs[index];
	}

	static int getAmountOfParagraphs() {
		return arrayOfParagraphs.length;
	}

	void setParagraph(int index, String paragraph) {
		arrayOfParagraphs[index] = paragraph;
	}

	void stringToArray(String stringToSplit) {
		arrayOfParagraphs = stringToSplit.split("[\\r\\n\\t]");
	}

}
