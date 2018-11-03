package first_package;

public class Massive {

	public int length;
	public int[] array;

	public Massive() {
	}

	public Massive(int[] array) {
		this.length = array.length;
		this.array = array;
	}

	public int sumOfElements() {
		int result = 0;
		for (int i : array) {
			result += i;
		}
		return result;
	}

	public int diffOfElements() {
		int result = 0;
		for (int i : array) {
			result -= i;
		}
		return result;
	}

	public int multiplicationOfElements() {
		int result = 1;
		for (int i : array) {
			result *= i;
		}
		return result;
	}

	public double divisionOfElements() {
		double result = 1.00;
		for (int i : array) {
			result /= i;
			throw new ArithmeticException();
		}
		return result;
	}

	public int[] reversArray(int[] array) {
		int[] result = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			result[i] = array[array.length - 1 - i];
		}
		return result;
	}

	public int[] clearArray() {
		array = null;
		return array;
	}

}
