import java.util.Scanner;

public class Task2_4 {
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
		int count = 0;
		int i = 0;
		while (i < mass.length) {
			if (mass[i] == 0) {
				count++;
			}
			i++;
		}
		if (count > 0) {
			System.out.println("���������� ������� ���������: " + count);
		} else {
			System.out.println("������� �������� �� �������");
		}
	}
}