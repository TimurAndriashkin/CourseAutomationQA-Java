package tasksAtBreakTime;

import java.util.Scanner;
// ѕодсчитать количество содержащихс€ в данном тексте знаков препинан€.
public class Task10 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter text: ");
		String text = read.nextLine();
		int before = text.length();
		int after = text.replaceAll("[-.?!)(,:]", "").length();
		System.out.println("Amount of punctuation marks: " + (before - after));
		read.close();
	}
}
