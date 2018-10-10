package tasksLesson7;

import java.util.Scanner;

public class Task7_2 {
	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		System.out.println("Введите количество строк:");
		int numberOfStrings = scaner.nextInt();
		String[] string = new String[numberOfStrings];
		System.out.println("Введите строки: ");
		for (int i = 0; i < string.length; i++) {
			string[i] = scaner.next();
		}
		for (int i = 0; i < string.length; i++) {
			for (int j = 0; j < string.length - 1; j++) {
				if (string[j].length() > string[j + 1].length()) {
					String buff = string[j];
					string[j] = string[j + 1];
					string[j + 1] = buff;
				}
			}

		}
		System.out.print("Строки массива в порядке возрастания их длинны: ");
		for (String line : string) {
			System.out.print(line + " (" + line.length() + ")" + " ");
		}
	}
}
