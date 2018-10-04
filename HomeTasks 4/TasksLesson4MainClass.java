import java.util.Scanner;

public class TasksLesson4MainClass {

	public static void main(String[] args) {

// Первое задание

		Person person = new Person();
		person.setName("Timur");
		person.setSurname("Andriashkin");
		person.setAge(22);
		person.setPhone("+375292602368");
		person.printAllInformation();
		person.printName();
		System.out.println("Person is adult: " + person.isAdult());

// Второе задание

		System.out.print("Введите размер массива : ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int[] mass = new int[a];
		scanner.close();
		System.out.println("Размер массива равен: " + mass.length);
		for (int i = 0; i < mass.length; i++) {
			mass[i] = (int) (Math.random() * mass.length);
		}
		Massive massive = new Massive();
		massive.printMassiveAsLine(mass);
		System.out.println();
		massive.printReverseMassiveAline(mass);
		System.out.println();
		int sum = massive.getSumOfElements(mass);
		System.out.println("Сумма элементов массива = " + sum);
		massive.multiptyBy3(mass);
		massive.printMassiveAsLine(mass);
		System.out.println();
		massive.printReverseMassiveAline(mass);
	}
}