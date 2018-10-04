import java.util.Scanner;

public class Task2_11 {
	public static void main(String[] args) {
		System.out.print("Введите размер массива : ");
		Scanner scaner = new Scanner(System.in);
		int a = scaner.nextInt();
		int[] mass = new int[a];
		System.out.println("Размер массива равен: " + mass.length);
		System.out.print("Массив состоит из: ");
		for (int i = 0; i < mass.length; i++) {
			mass[i] = (int) (Math.random() * mass.length);
			System.out.print(mass[i] + " ");
		}
		int[] mass2 = new int[a];

		System.out.println();

		for (int i = 0; i < mass.length; i++) {
			if (i == 0) {
				mass2[i] = mass[i + 1] / 2;
			} else if (i == mass.length - 1) {
				mass2[mass.length - 1] = mass[i - 1] / 2;
			} else {
				mass2[i] = (mass[i - 1] + mass[i + 1]) / 2;
			}
		}
		System.out.print("Массив состоит из: ");
		for (int i = 0; i < mass2.length; i++) {
			System.out.print(mass2[i] + " ");
		}

	}
}
