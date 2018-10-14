package tasksAtBreakTime;

import java.util.Scanner;
// � �������� ������ ����� ����� ���� ������������� ����.
public class Task11 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("������� �����: ");
		String text = read.nextLine();
		int i = 0;
		int sum = 0;
		// ��� �������� ������ �����
		StringBuilder listOfDigits = new StringBuilder();
		// ��� ������ ������-������ ��������� �����
		StringBuilder outputListOfDigits = new StringBuilder();

		while (i < text.length()) {
			if (Character.isDigit(text.charAt(i))) {
				listOfDigits.append(text.charAt(i));
				i++;
				int k = Integer.parseInt(listOfDigits.toString());
				sum += k;
				outputListOfDigits.append(k + ", ");
				listOfDigits.delete(0, listOfDigits.length());
			} else
				i++;
		}

		if (outputListOfDigits.length() == 0) {
			System.out.println("����� � ������ �� �������");
		} else {
			System.out.println("��������� � ������ �����: ");
			System.out.println(
					outputListOfDigits.delete(outputListOfDigits.length() - 2, outputListOfDigits.length() - 1));
			System.out.println("����� ����� � �������� ������ = " + sum);
		}
		read.close();
	}

}
