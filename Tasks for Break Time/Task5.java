package tasksAtBreakTime;

import java.util.Scanner;
// Удалить из текста его часть, заключенную между двумя символами, которые вводятся (например, между скобками <(> и <)> или между звездочками <*> и т.п.)
public class Task5 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter text:");
		String text = read.nextLine();

		text = text.replaceAll("\\*.*\\*", "**").replaceAll("\\[.*\\]", "[]").replaceAll("\\(.*\\)", "()")
				.replaceAll("\\{.*\\}", "**").replaceAll("\".*\"", "\"\"").replaceAll("\'.*\'", "\'\'");
		System.out.println("This is final text: " + text);
		read.close();
	}
}