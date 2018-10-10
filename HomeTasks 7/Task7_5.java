package tasksLesson7;

import java.util.Scanner;

public class Task7_5 {

	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		System.out.println("������� ���������� ����:");
		int numberOfStrings = scaner.nextInt();
		int numberWordsWithEqualLetters = 0;
		String[] words = new String[numberOfStrings];
		System.out.println("������� �����: ");
		for (int i = 0; i < words.length; i++) {
			words[i] = scaner.next();
		}
		for (String word : words) {
			int countEnLetters = 0;
			int balanceLatters = 0;
// ���������� ��� �� ������
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
// �������� ��� �� ������� ���������
			if (countEnLetters == word.length()) {
// �������� ������� ������� � ��������� ����
				if (balanceLatters == 0) {
					++numberWordsWithEqualLetters;
				}
			}
		}
		System.out.println("���������� ���� � ������ ������ ������� � ��������� ���� : " + numberWordsWithEqualLetters);
	}
}
