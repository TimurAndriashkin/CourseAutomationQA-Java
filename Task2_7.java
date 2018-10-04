import java.util.Scanner;

public class Task2_7 {
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
		for (int i = 0, temp = mass.length - 1; i < mass.length / 2 && temp / 2 >= 0; i++, temp--) {
			int buf = mass[i];
			mass[i] = mass[temp];
			mass[temp] = buf;
		}
		System.out.println();
		System.out.print("Массив состоит из: ");
		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i] + " ");
		}
	}
}
