import java.util.Scanner;

public class Task2_10 {
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
			System.out.println("������ �������� ������ ������������ ������������������");
		} else {
			System.out.println("������ �� �������� ������ ������������ ������������������");
		}

	}
}
