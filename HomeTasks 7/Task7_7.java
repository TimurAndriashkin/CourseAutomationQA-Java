package tasksLesson7;

import java.util.Scanner;

public class Task7_7 {

	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		System.out.println("¬ведите количество слов:");
		int numberOfStrings = scaner.nextInt();
		int wordUniqCount = 0;
		String uniqueWord = null;
		String[] words = new String[numberOfStrings];
		System.out.println("¬ведите слова: ");
		for (int i = 0; i < words.length; i++) {
			words[i] = scaner.next();
		}

		for (String word : words) {
			int counter = 0;
			for (int i = 0; i < word.length() - 1; i++) {
				for (int j = i + 1; j < word.length(); j++) {
					if (word.charAt(i) == word.charAt(j)) {
						counter++;
						break;
					}
				}
				if (counter != 0) {
					break;
				}
			}
			if (counter == 0) {
				uniqueWord = word;
				break;
			}

		}
		if (uniqueWord != null) {
			System.out.println("Cлово, состо€щее только из различных символов :" + uniqueWord);

		} else {
			System.out.println("Cлово, состо€щее только из различных символов не найдено");
		}
	}
}
