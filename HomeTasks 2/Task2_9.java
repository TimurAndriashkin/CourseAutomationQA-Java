import java.util.Scanner;

public class Task2_9 {
	public static void main(String[] args) {
		System.out.print("Введите размер массива: ");
		Scanner scaner = new Scanner(System.in);
		int a = scaner.nextInt();
		int[] mass = new int[a];
		System.out.println("Размер массива равен: " + mass.length);
		System.out.print("Массив состоит из: ");
		for (int i = 0; i < mass.length; i++) {
			mass[i] = (int) (Math.random() * mass.length);
			System.out.print(mass[i] + " ");
		}
		System.out.println();
		int max = mass[0];
		int min = mass[0];
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] > max) {
				max = mass[i];
			}
			if (mass[i] < min) {
				min = mass[i];
			}

		}
		System.out.println("Минимальное значение массива: " + min);
		System.out.println("Максимальное значение массива: " + max);

		System.out.print("Номер(а) минимального элемента(ов): ");
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] == min) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		System.out.print("Номер(а) максимального элемента(ов): ");
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] == max) {
				System.out.print(i + " ");
			}
		}
	}
}