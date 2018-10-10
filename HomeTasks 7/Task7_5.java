package tasksLesson7;

import java.util.Scanner;

public class Task7_5 {

	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		System.out.println("Введите количество слов:");
		int numberOfStrings = scaner.nextInt();
		int numberWordsWithEqualLetters = 0;
		String[] words = new String[numberOfStrings];
		System.out.println("Введите слова: ");
		for (int i = 0; i < words.length; i++) {
			words[i] = scaner.next();
		}
		for (String word : words) {
			int countEnLetters = 0;
			int balanceLatters = 0;
// Побуквенно идём по словам
			for (Character letter : word.toCharArray()) {
				if (((letter >= 'A') && (letter <= 'Z')) || ((letter >= 'a') && (letter <= 'z'))) {
					countEnLetters++;
					if ((letter == 'A') || (letter == 'E') || (letter == 'I') || (letter == 'O') || (letter == 'U')
							|| (letter == 'Y') || (letter == 'a') || (letter == 'e') || (letter == 'i')
							|| (letter == 'o') || (letter == 'u') || (letter == 'y'))
						++balanceLatters;
					else
						--balanceLatters;
				}
			}
// Проверка все ли символы латинские
			if (countEnLetters == word.length()) {
// Проверка баланса гласных и согласных букв
				if (balanceLatters == 0) {
					++numberWordsWithEqualLetters;
				}
			}
		}
		System.out.println("Количество слов с равным числом гласных и согласных букв : " + numberWordsWithEqualLetters);
	}
}
