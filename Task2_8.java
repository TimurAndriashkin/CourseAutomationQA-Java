import java.util.Scanner;

public class Task2_8 {
	public static void main(String[] args) {
		System.out.print("������� ������ �������: ");
		Scanner scaner = new Scanner(System.in);
		int a = scaner.nextInt();
		int[] mass = new int[a];
		System.out.println("������ ������� �����: " + mass.length);
		System.out.print("������ ������� ��: ");
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
		System.out.println("����������� �������� �������: " + min);
		System.out.println("������������ �������� �������: " + max);

	}
}