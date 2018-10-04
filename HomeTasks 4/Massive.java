
public class Massive {

	public void printMassiveAsLine(int[] mass) {
		System.out.print("Массив состоит из: ");
		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i] + " ");
		}
	}

	public void printReverseMassiveAline(int[] mass) {
		System.out.print("Массив состоит из: ");
		for (int i = mass.length - 1; i >= 0; i--) {
			System.out.print(mass[i] + " ");
		}
	}

	public int getSumOfElements(int[] mass) {
		int sum = 0;
		for (int i = 0; i < mass.length; i++) {
			sum = sum + mass[i];
		}
		return sum;
	}

	public int[] multiptyBy3(int[] mass) {
		for (int i = 0; i < mass.length; i++) {
			mass[i] = mass[i] * 3;
		}
		return mass;
	}

}
