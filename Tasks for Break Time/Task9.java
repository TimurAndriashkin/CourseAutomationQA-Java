package tasksAtBreakTime;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Преобразовать текст так, чтобы каждое слово, не содержащее неалфавитных символов, начиналось с заглавной буквы.
public class Task9 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter text: ");
		String text = read.nextLine();
		String finalText = "";
		String[] words = text.split(" ");

		for (String word : words) {
			if (stringValidator(word)) {
				String first = word.substring(0, 1).toUpperCase();
				String all = word.substring(1);
				finalText += first + all + " ";
			}
		}
		read.close();
		System.out.println("Final text: " + finalText);
	}

	static boolean stringValidator(String string) {
		Pattern p = Pattern.compile("[a-zA-zа-яА-я]+$");
		Matcher m = p.matcher(string);
		return m.matches();
	}
}