package tasksLesson7;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7_8 {

	public static void main(String[] args) {

		Scanner scaner = new Scanner(System.in);
		System.out.println("¬ведите количество слов:");
		int numberOfStrings = scaner.nextInt();
		String[] words = new String[numberOfStrings];
		System.out.println("¬ведите слова: ");
		for (int i = 0; i < words.length; i++) {
			words[i] = scaner.next();
		}
		ArrayList<StringBuffer> numberWords = new ArrayList<>();
		for (String word : words) {
			if (stringValidator(word)) {
				StringBuffer s_buffer = new StringBuffer(word.subSequence(0, word.length()));
				numberWords.add(s_buffer);
			}
		}
		for (int i = 0; i < numberWords.size(); i++) {

			if (!numberWords.get(i).toString().equals(numberWords.get(i).reverse().toString())) {
				numberWords.remove(i);
			}
		}

		try {
			StringBuffer finalWord = numberWords.size() <= 1 ? numberWords.get(0) : numberWords.get(1);
			System.out.println("Cлово-палиндром: " + finalWord);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Empty list!");
		}

	}

	static boolean stringValidator(String string) {
		Pattern p = Pattern.compile("^[0-9]+$");
		Matcher m = p.matcher(string);
		return m.matches();
	}
}