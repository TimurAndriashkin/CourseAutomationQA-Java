package tasksAtBreakTime;

import java.util.HashMap;
import java.util.Scanner;
// Определить, сколько раз повторяется в тексте каждое слово, которое встречается в нем.
public class Task6 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter text:");
		String text = read.nextLine();
		text = text.toLowerCase();
		String[] words = text.replaceAll("[-.?!)(,:]", "").split("\\s");
		HashMap<String, Integer> wordToCount = new HashMap<>();
		for (String word : words) {
			if (!wordToCount.containsKey(word)) {
				wordToCount.put(word, 0);
			}
			wordToCount.put(word, wordToCount.get(word) + 1);
		}
		for (String word : wordToCount.keySet()) {
			System.out.println(word + " " + wordToCount.get(word));
		}
		read.close();
	}
}