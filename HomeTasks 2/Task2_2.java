import java.util.Scanner;

public class Task2_2 {
	public static void main(String[] args) {
		System.out.print("������� ������ �������: ");
		Scanner scaner = new Scanner(System.in);
		int a = scaner.nextInt();
		int[] mass = new int[a];
		System.out.println("������� �������� �������: ");
		for (int i = 0; i < mass.length; i++) {
			mass[i] = scaner.nextInt();
		}
		int mult = 1;
		for (int i = 0; i < mass.length; i++) {
			mult *= mass[i];
		}
		System.out.println("������������ ���� ��������� ������� = " + mult);
	}
}
