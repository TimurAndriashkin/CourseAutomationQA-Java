package tasksAtBreakTime;

import java.util.Scanner;

// »з текста удалить все символы, кроме пробелов, не €вл€ющиес€ буквами. ћежду последовательност€ми подр€т идущих букв оставить хот€ бы один пробел.

public class Task4 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter text:");
		String text = read.nextLine();

		text = text.replaceAll("[\t\n\f\r]", " ");
		text = text.replaceAll("[^a-zA-Zа-€ј-я ]", "");
		System.out.println("This is final text: " + text);
		read.close();
	}
}
