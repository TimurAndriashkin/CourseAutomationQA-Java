import java.util.Scanner;

public class Task2_3 {
	public static void main(String[] args) {
		System.out.print("������� ������ �������: ");
		Scanner scaner = new Scanner(System.in);
		int a = scaner.nextInt();
		int[] mass1 = new int[a];
		System.out.println("������� �������� �������: ");
		for (int i = 0; i < mass1.length; i++) {
			mass1[i] = scaner.nextInt();
		}
		System.out.print("������ ������� ��: ");
		for (int i = 0; i < mass1.length; i++) {
			System.out.print(mass1[i] + " ");
		}
		System.out.println();
		// ������ ������
		System.out.print("������ ������ ������������: ");
		for (int i = 0; i < mass1.length; i++) {
			if (i % 3 == 0) {
				mass1[i] = mass1[i] * 2;
			}
			System.out.print(mass1[i] + " ");
		}
		System.out.println();

		// ������ ������
		int[] mass2 = new int[a];
		for (int i = 0; i < mass2.length; i++) {
			mass2[i] = mass1[i];
		}
		for (int i = 0; i < mass2.length; i += 3) {
			mass2[i] = mass2[i] * 2;
		}
		System.out.print("������ ������ ������������: ");
		for (int i = 0; i < mass2.length; i++) {
			System.out.print(mass2[i] + " ");
		}
	}
}
