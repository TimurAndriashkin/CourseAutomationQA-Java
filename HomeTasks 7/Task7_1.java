package tasksLesson7;

import java.util.Scanner;

public class Task7_1 {

	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		System.out.println("Введите количество строк:");
		int numberOfStrings = scaner.nextInt();
		String[] string = new String[numberOfStrings];
		String maxString = null;
		String minString = null;
		System.out.println("Введите строки: ");
		for (int i = 0; i < string.length; i++) {
			string[i] = scaner.next();
		}
		maxString = string[0];
		minString = string[0];
		for (int i = 1; i < string.length; i++) {
			minString = (string[i].length() < minString.length()) ? string[i] : minString;
			maxString = (string[i].length() > maxString.length()) ? string[i] : maxString;
		}
		System.out.println("Строка с максимальной длинной: " + maxString + " (" + maxString.length() + ")");
		System.out.println("Строка с минимальной длинной: " + minString + " (" + minString.length() + ")");

	}

}