import java.util.Scanner;

public class TasksLesson4MainClass {

	public static void main(String[] args) {

// ������ �������

		Person person = new Person();
		person.setName("Timur");
		person.setSurname("Andriashkin");
		person.setAge(22);
		person.setPhone("+375292602368");
		person.printAllInformation();
		person.printName();
		System.out.println("Person is adult: " + person.isAdult());

// ������ �������

		System.out.print("������� ������ ������� : ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int[] mass = new int[a];
		scanner.close();
		System.out.println("������ ������� �����: " + mass.length);
		for (int i = 0; i < mass.length; i++) {
			mass[i] = (int) (Math.random() * mass.length);
		}
		Massive massive = new Massive();
		massive.printMassiveAsLine(mass);
		System.out.println();
		massive.printReverseMassiveAline(mass);
		System.out.println();
		int sum = massive.getSumOfElements(mass);
		System.out.println("����� ��������� ������� = " + sum);
		massive.multiptyBy3(mass);
		massive.printMassiveAsLine(mass);
		System.out.println();
		massive.printReverseMassiveAline(mass);
	}
}