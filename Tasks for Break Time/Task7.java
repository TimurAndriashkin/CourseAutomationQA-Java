package tasksAtBreakTime;

import java.util.Scanner;
// � ������ ����� ������ ��������� ������������ ������, �� ���������� ����.
public class Task7 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter text: ");
		String text = read.nextLine();
		int maximalLength = 0;
		int maximalLengthIndex = 0;
		String[] words = text.split("[a-zA-Z�-��-�]+");
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > maximalLength) {
				maximalLength = words[i].length();
				maximalLengthIndex = i;
			}
		}
		System.out.println(
				"������ ��������� � ������, ������������ ������, �� ���������� ����: " + words[maximalLengthIndex]);
		read.close();
	}

}
