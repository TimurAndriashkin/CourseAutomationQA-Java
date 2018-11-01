package first_package;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Massive {

	public Massive() {

	}

	public Massive(int i) {
		i = 9 / i;
	}

	int firstNumber = 20;
	int secondNumber = 0;
	int result;
	int size = 1;
	int[] arrayFirst = new int[size];
	int[] arraySecond;
	int length;

	public int getTryCatch() {
		try {
			result = firstNumber / secondNumber;
		} catch (ArithmeticException e) {
			System.out.println("Dividing to 0");
		}
		return result;
	}

// Second Task with "try with resources"
	void getTryCatchCatch() {
		try (Scanner scaner = new Scanner(System.in)) {

			System.out.println("Enter array lenght (please don't input letters (@-@) ): ");
			size = scaner.nextInt();
			arraySecond = new int[size];
		} catch (NegativeArraySizeException e) {
			System.out.println("Enter only positive numbers...please");
		} catch (InputMismatchException ex) {
			System.out.println("Hey, input only numbers!!!");
		}
	}

	void getMultiCatch() {
		try {
			System.out.println(arraySecond.length / secondNumber);
		} catch (ArithmeticException | NullPointerException ex) {
			System.out.println("Dividing to 0 (Multi-catch)");
		}
	}

	void getTryCatchFinally() {
		try {
			for (int i = 0; i < arrayFirst.length; i += 2) {
				i++;
				System.out.println(arrayFirst[i]);
			}
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("I can't find the element of array, please help me!");
		} finally {
			System.out.println("Something gone wrong :-) ");
		}
	}

	void getTryInsideTry() {
		try {
			result = firstNumber + 10;
			try {
				if (result > firstNumber) {
					result = result / 0;
				}
			} catch (ArithmeticException ex) {
				System.out.println("Dividing to 0 (in the second try)");
			}
		} catch (Exception e) {
			System.out.println("Wow...something gone wrong");
		}
	}

	void afterSkipingFinallyBlock() {
		try {
			result = firstNumber / secondNumber;
		} catch (ArithmeticException ex) {
			System.out.println("Dividing to 0");
			System.out.println("Finally block will print below...");
		} finally {
			System.out.println("Hello, i'm Finally");
		}
	}

	void skipFinallyBlock() {
		try {
			result = firstNumber / secondNumber;
		} catch (ArithmeticException ex) {
			System.out.println("Dividing to 0");
			System.out.println("Finally block will print below...");
			System.exit(0);
		} finally {
			System.out.println("Hello, i'm Finally");
		}
	}
}
