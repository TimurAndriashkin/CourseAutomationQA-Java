package tasksAtBreakTime;

import java.util.Scanner;

// �� ������ ������� ��� �������, ����� ��������, �� ���������� �������. ����� �������������������� ������ ������ ���� �������� ���� �� ���� ������.

public class Task4 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter text:");
		String text = read.nextLine();

		text = text.replaceAll("[\t\n\f\r]", " ");
		text = text.replaceAll("[^a-zA-Z�-��-� ]", "");
		System.out.println("This is final text: " + text);
		read.close();
	}
}
