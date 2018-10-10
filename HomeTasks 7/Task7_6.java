package tasksLesson7;

import java.util.Scanner;

public class Task7_6 {

	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		System.out.println("Введите количество слов:");
		int numberOfStrings = scaner.nextInt();
		int wordCount = 0;
		String[] words = new String[numberOfStrings];
		System.out.println("Введите слова: ");
		for (int i = 0; i < words.length; i++) {
			words[i] = scaner.next();
		}
		for (String word : words) {
			int count = 0;
			for (int i = 1; i < word.length(); i++) {
				if (word.toCharArray()[i] > word.toCharArray()[i - 1]) {
					count++;
				}
			}
			if ((word.length() - 1 == count) && (word.length() > 1) && (wordCount == 0)) {
				System.out.println("Cлово, символы в котором идут в строгом порядке возрастания их кодов: " + word);
				wordCount++;
			}
		}
		if (wordCount == 0) {
			System.out.println("Словно не найдено");
		}
	}

}
