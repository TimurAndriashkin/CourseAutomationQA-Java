package second_package;

import first_package.Tester;

public class TesterMainSecond {

	public static void main(String[] args) {
		Tester tester = new Tester("Tim", "Richards", 11, "Advance", 3060);
		tester.printTesterInformation(tester);

		/*
		 * Methods from task2 can NOT be used in the other packages because it's
		 * friendly methods. We can use this methods only in the same package.
		 */
		// Method from task 3 can NOT be used in the other classes because it's private method of Tester class'.

		/*
		 * Method from task 4 can NOT be used in the other packages because it's
		 * friendly methods. We can use this method only in the same package.
		 */

		/* Method from task 5 can be used only in subclasses of the Tester class. 
		 * (We can create a subclass of the Tester class and use ours method)
		 */

		// Method from task 6

		tester.printTesterInformation(tester);
	}

}
