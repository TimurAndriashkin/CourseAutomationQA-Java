package tasksLesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TesterMain {

	public static void main(String[] args) {
		Tester tester1 = new Tester();
		Tester tester2 = new Tester("Erik");
		Tester tester3 = new Tester("Karl", "Varok");
		Tester tester4 = new Tester("Alex", "Lesley", 10);
		Tester tester5 = new Tester("Margaret", "Wilson", 20, "Native");
		Tester tester6 = new Tester("Elena", "Salmon", 17, "Intermidiate");
		Tester tester7 = new Tester("Tim", "Richards", 11, "Advance", 3060);
		Tester.printTesterInformation(tester2);
		Tester.printTesterInformation(tester7);
		System.out.println(regularLessThan4("Hello"));
		System.out.println(regularEquals4("#ab1"));
	}

	// Проверка на количество латинских букв не более 4
	public static boolean regularLessThan4(String anyString) {
		Pattern pattern = Pattern.compile("[a-zA-Z]{0,4}");
		Matcher matcher = pattern.matcher(anyString);
		return matcher.matches();
	}

	// Проверка на количество любых символов, равное 4-м
	public static boolean regularEquals4(String anyString) {
		Pattern p = Pattern.compile(".{4}");
		Matcher m = p.matcher(anyString);
		return m.matches();
	}
}
