package tasksAtBreakTime;

import java.util.Scanner;
// В тексте определить все согласные буквы, встречающиеся не более чем в двух словах.
public class Task8 {
	public static void main(String[] str) {
		int j = 0;
		int[] mass = { 'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'ц', 'ч', 'ш',
				'щ', 'х', 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x',
				'y', 'z' };
		int[] mass2 = new int[mass.length];
		Scanner read = new Scanner(System.in);
		System.out.println("Enter text: ");
		String text = read.nextLine();
		String[] words = text.toLowerCase().split(" ");
		for (String word : words) {

			j = j + 1;
			for (int i = 0; i < mass.length; i++) {
				int currentChar = mass[i];
				if (word.indexOf(currentChar) > -1) {
					mass2[i]++;
				}
			}
		}
		char[] mass3 = { 'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'ц', 'ч', 'ш',
				'щ', 'х', 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x',
				'y', 'z' };
		for (int i = 1; i < mass.length; i++) {
			if ((mass2[i] < 3) && (mass2[i] != 0)) {
				System.out.println(" Letter " + "\"" + mass3[i] + "\"" + " occurs in the words");

				System.out.println(mass2[i] + " time");
			}
		}
		read.close();
	}
}
