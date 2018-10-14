package tasksAtBreakTime;

import java.util.Scanner;

public class Task1 {
// В тексте после k-го символа вставить заданную подстроку
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter text:");
		String text = read.nextLine();
		System.out.println("Enter substring: ");
		String sub = read.nextLine();
		System.out.println("Enter symbol: ");
		int k = read.nextInt();
		System.out.printf("Rsult:%s%s", System.lineSeparator(), putSubstring(text, sub, k));
		read.close();
	}

	public static String putSubstring(String text, String substring, int k) {
		StringBuilder sb = new StringBuilder();
		if (text != null && substring != null && k > 0) {
			int count = 1;
			for (int i = 0; i < text.length(); i++) {
				sb.append(text.charAt(i));
				if (count == k) {
					sb.append(substring);
				}
				count++;
			}
		}
		return sb.toString();
	}

}
