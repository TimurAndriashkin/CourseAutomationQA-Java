package tasksLesson7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task7_4 {

	public static void main(String[] args) {

		Scanner scaner = new Scanner(System.in);
		System.out.println("¬ведите количество слов:");
		int numberOfStrings = scaner.nextInt();
		String[] words = new String[numberOfStrings];
		System.out.println("¬ведите слова: ");
		for (int i = 0; i < words.length; i++) {
			words[i] = scaner.next();
		}
		String wordMinChar = words[0];
		int sizeMinCharWord = new HashSet<String>(Arrays.asList(words[0].split(""))).size();
		for (String word : words) {
			Set<String> set = new HashSet<String>(Arrays.asList(word.split("")));
			if (set.size() < sizeMinCharWord) {
				wordMinChar = word;
				sizeMinCharWord = set.size();
			}
		}
		System.out.println("—лово с минимальным числом различных символов: " + wordMinChar);
	}
}
