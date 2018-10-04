import java.util.Scanner;

public class Task2_6 {
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
		for (int i = 0; i < mass.length - 1; i += 2) {
			int temp = mass[i];
			mass[i] = mass[i + 1];
			mass[i + 1] = temp;
		}
		System.out.println();
		System.out.print("Массив состоит из: ");
		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i] + " ");
		}
	}
}