import java.util.Scanner;

public class Task2_12 {
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

		int movePosition = 2;
		for (int i = 0; i < mass.length; i++) {
			if ((movePosition + i) >= mass.length) {
				mass2[i - mass.length + movePosition] = mass[i];
			} else {
				mass2[i + movePosition] = mass[i];
			}
		}
		System.out.print("Массив состоит из: ");
		for (int i = 0; i < mass2.length; i++) {
			System.out.print(mass2[i] + " ");
		}
	}
}