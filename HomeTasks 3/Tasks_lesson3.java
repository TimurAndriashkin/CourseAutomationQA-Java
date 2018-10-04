
public class Tasks_lesson3 {

	public static void main(String[] args) {
		double a = Math.random() + 10;
		double b = Math.random() + 10;
		double min = minNumber(a, b);
		boolean result = printNumberStatus(min);
		double squareOfNumber = printNumberSquare(min);
		double cubeOfNumber = printNumberCube(min);

		System.out.println("Значения: " + a + ", " + b);
		System.out.println("Наименьшее значение: " + min);
		System.out.println("Является ли наименьшее значение четным : " + result);
		System.out.println("Наименьшее значение в квадтрате: " + squareOfNumber);
		System.out.println("Наименьшее значение в кубе: " + cubeOfNumber);

	}

	private static double minNumber(double a, double b) {
		double min = Math.min(a, b);
		return min;
	}

	private static boolean printNumberStatus(double a) {
		boolean result;
		if (a % 2 == 0) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	private static double printNumberSquare(double a) {
		return a * a;
	}

	private static double printNumberCube(double a) {
		return a * a * a;
	}

}
