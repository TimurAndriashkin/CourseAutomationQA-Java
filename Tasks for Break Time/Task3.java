package tasksAtBreakTime;

import java.util.Scanner;

public class Task3 {
// � ����������� �� �������� (0 ��� 1) � ������ ������ ������ ������� ��������� ������ �����, ��� �� �����������, ��� �������� ��� ����� k-�o �������
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter text:");
		String text = read.nextLine();
		System.out.println("Enter a symbol: ");
		String forChar = read.nextLine();
		System.out.println("Enter a index of <k> symbol: ");
		int positionToSet = read.nextInt();
		String[] words = text.split(" ");
		String finalText = "";

		for (int i = 0; i < words.length; i++) {
			if (wordCheck(words[i], forChar)) {
				words[i] = words[i].replaceAll(forChar, " ");
			} else {
				words[i] = words[i].substring(0, positionToSet) + forChar
						+ words[i].substring(positionToSet, words[i].length());
			}
			finalText += words[i] + " ";
		}
		System.out.println("Final text: " + finalText);
		read.close();
	}

	public static boolean wordCheck(String wordToCheck, String forChar) {
		for (int i = 0; i < wordToCheck.length(); i++) {
			if (wordToCheck.charAt(i) == forChar.charAt(0)) {
				return true;
			}
		}
		return false;
	}
}
