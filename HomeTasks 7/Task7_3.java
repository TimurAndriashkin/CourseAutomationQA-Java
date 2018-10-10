package tasksLesson7;

import java.util.ArrayList;
import java.util.Scanner;

public class Task7_3 {

	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		System.out.println("������� ���������� �����:");
		int numberOfStrings = scaner.nextInt();
		String[] string = new String[numberOfStrings];
		System.out.println("������� ������: ");
		for (int i = 0; i < string.length; i++) {
			string[i] = scaner.next();
		}
		int totalSize = 0;
		for (int i = 0; i < string.length; i++) {
			totalSize += string[i].length();
		}
		int middleSize = totalSize / string.length;

		System.out.print("C�����, ����� ������� ������ ������� ������: ");
		for (String line : string) {
			if (line.length() < middleSize)
				System.out.print(line + " (" + line.length() + ")" + " ");
		}

	}
}