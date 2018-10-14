package tasksAtBreakTime;

import java.util.Scanner;
// После каждого слова текста, заканчивающегося заданной подстрокой, вставить указанное слово
public class Task2 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter text:");
		String text = read.nextLine();
		System.out.println("Enter a substring after wich we will paste a word: ");
		String substring = read.nextLine();
		System.out.println("Enter a word: ");
		String word = read.nextLine();
		String[] splitString = text.split(" ");
		String finalString = "";

		for (int i = 0; i < splitString.length; i++) {
			if (splitString[i].endsWith(substring)) {
				finalString += splitString[i].concat(word).concat(" ");
			} else {
				finalString += splitString[i].concat(" ");
			}
		}

		System.out.println(finalString);

		read.close();

	}
}
