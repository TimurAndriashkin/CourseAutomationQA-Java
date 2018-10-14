package tasksAtBreakTime;

import java.util.Scanner;
// В заданном тексте найти сумму всех встречающихся цифр.
public class Task11 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Введите текст: ");
		String text = read.nextLine();
		int i = 0;
		int sum = 0;
		// для парсинга каждой цифры
		StringBuilder listOfDigits = new StringBuilder();
		// для вывода строки-списка найденных чисел
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
			System.out.println("Чисел в тексте не найдено");
		} else {
			System.out.println("Найденные в тексте числа: ");
			System.out.println(
					outputListOfDigits.delete(outputListOfDigits.length() - 2, outputListOfDigits.length() - 1));
			System.out.println("Сумма чисел в заданном тексте = " + sum);
		}
		read.close();
	}

}
