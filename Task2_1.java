import java.util.Scanner;

public class Task2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Введите размер массива: ");
		Scanner scaner = new Scanner(System.in);
		int a = scaner.nextInt();
		int[] mass = new int[a];
		System.out.println("Размер массива равен: " + mass.length);
		System.out.print("Массив состоит из: ");
		for (int i = 0; i < mass.length; i++) {
			mass[i] = (int) (Math.random() * mass.length);
		}
		// Вывод значений массива в прямом порядке
		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i] + " ");
		}
		System.out.println();
		System.out.print("Массив состоит из: ");
		// Вывод значений массива в обратном порядке
		for (int i = mass.length - 1; i >= 0; i--) {
			System.out.print(mass[i] + " ");
		}
	}
}