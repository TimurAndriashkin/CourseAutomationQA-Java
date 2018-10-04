import java.util.Scanner;

public class Task2_4 {
	public static void main(String[] args) {
		System.out.print("Введите размер массива: ");
		Scanner scaner = new Scanner(System.in);
		int a = scaner.nextInt();
		int[] mass = new int[a];
		System.out.println("Введите элементы массива: ");
		for (int i = 0; i < mass.length; i++) {
			mass[i] = scaner.nextInt();
		}
		System.out.println("Размер массива равен: " + mass.length);
		int count = 0;
		int i = 0;
		while (i < mass.length) {
			if (mass[i] == 0) {
				count++;
			}
			i++;
		}
		if (count > 0) {
			System.out.println("Количество нулевых элементов: " + count);
		} else {
			System.out.println("Нулевые элементы не найдены");
		}
	}
}