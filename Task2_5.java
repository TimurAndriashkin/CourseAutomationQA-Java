import java.util.Scanner;

public class Task2_5 {
	public static void main(String[] args) {
		System.out.print("������� ������ �������: ");
		Scanner scaner = new Scanner(System.in);
		int a = scaner.nextInt();
		int[] mass = new int[a];
		System.out.println("������� �������� �������: ");
		for (int i = 0; i < mass.length; i++) {
			mass[i] = scaner.nextInt();
		}
		System.out.println("������ ������� �����: " + mass.length);
		int numb = 0;
		System.out.print("������ ������� ���������: ");
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] == 0) {
				System.out.print(i + " ");
				numb++;
			}
		}
		if (numb == 0) {
			System.out.println("������� �������� �� �������");
		}
	}
}