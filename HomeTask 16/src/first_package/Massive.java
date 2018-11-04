package first_package;

import java.util.Arrays;

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

	public double averageForArray() {
		return sumOfElements() / array.length;
	}

	public int getAmountOfEvenElements() {
		int counter = 0;
		for (int i : array) {
			if (i % 2 == 0) {
				counter++;
			}
		}
		return counter;
	}

	public int getAmountOfUnevenElements() {
		int counter = 0;
		for (int i : array) {
			if (i % 2 != 0) {
				counter++;
			}
		}
		return counter;
	}

	public int[] getArrayAfterMultiplyingEachThirdElement() {
		for (int i = 0; i < array.length; i++) {
			if (i % 3 == 0) {
				array[i] = array[i] * 2;
			}
		}
		return array;
	}

	public int getSummMinAndMaxElements() {
		int max = array[0];
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}

		}
		return min + max;
	}

	public boolean hasAscendingArray() {
		boolean flag = true;
		int i = 0;
		while (i < array.length - 1) {
			if (array[i] >= array[i + 1]) {
				flag = false;
				break;
			}
			i++;
		}
		return flag;
	}

	public boolean hasAscendingArray(int[] array) {
		boolean flag = true;
		int i = 0;
		while (i < array.length - 1) {
			if (array[i] >= array[i + 1]) {
				flag = false;
				break;
			}
			i++;
		}
		return flag;
	}

	public int[] circularShiftingOfElements() {
		int[] array2 = new int[length];
		int movePosition = 2;
		for (int i = 0; i < array.length; i++) {
			if ((movePosition + i) >= array.length) {
				array2[i - array.length + movePosition] = array[i];
			} else {
				array2[i + movePosition] = array[i];
			}
		}
		return array2;
	}

	public Integer[] intToInteger(int[] intArray) {
		return Arrays.stream(intArray).boxed().toArray(Integer[]::new);
	}

}
