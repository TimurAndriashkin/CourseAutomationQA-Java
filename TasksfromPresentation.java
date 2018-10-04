
public class TasksfromPresentation {

	public static void main(String[] args) {

	}

	public void diff(int a, int b) {
		System.out.println(a - b);
	}

	public void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public int diff1(int a, int b) {
		return a - b;
	}

	public int sum1(int a, int b, int c) {
		return a + b + c;
	}

	public void printMassive(int[] mass) {
		System.out.print("Массив состоит из: ");
		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i] + " ");
		}
	}

	public void printMassiveLength(int[] mass) {
		System.out.println("Массив состоит из: " + mass.length + "элементов");
	}

	public double sumMassive(double[] mass) {
		double sum = 0;
		for (int i = 0; i < mass.length; i++) {
			sum = sum + mass[i];
		}
		return sum;
	}

	public float[] printMassiveFloat(float[] mass) {
		for (int i = 0; i < mass.length; i = i + 3) {
			mass[i] = -1;
		}
		return mass;
	}
}
