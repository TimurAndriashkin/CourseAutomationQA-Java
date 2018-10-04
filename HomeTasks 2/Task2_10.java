import java.util.Scanner;

public class Task2_10 {
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
		boolean flag = true;
		int i = 0;
		while (flag) {
			if (mass[i] >= mass[i + 1]) {
				flag = false;
				break;
			}
			i++;
		}
		if (flag == true) {
			System.out.println("Массив является строго возрастающей последовательность");
		} else {
			System.out.println("Массив не является строго возрастающей последовательность");
		}

	}
}
