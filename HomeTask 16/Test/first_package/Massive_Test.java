package first_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Massive_Test {
	Massive mass;
	Massive massNull;

	@BeforeMethod
	public void beforeMethod() {
		int[] array = { 1, 2, 3, 4, 5 };
		mass = new Massive(array);
	}

	@AfterMethod
	public void afterMethod() {
		mass.clearArray();
		mass = null;
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

	@BeforeSuite
	public void beforeSuite() {
	}

	@AfterSuite
	public void afterSuite() {
	}

	@Test(enabled = false)
	public void testFailed() {
		Assert.fail("Test failed! Only for the Experiment");
	}

	@Test
	public void testGetSum() {
		int expected_result = 15;
		int actual_result = mass.sumOfElements();
		Assert.assertEquals(expected_result, actual_result);
	}

	@Test
	public void testSameObj() {
		Massive mass2 = mass;
		Assert.assertSame(mass, mass2, "Objects are NOT same");
	}

	@Test
	public void testNotSameObj() {
		Massive mass2 = new Massive();
		Assert.assertNotSame(mass, mass2, "Objects are same");
	}

	@Test
	public void testReversArray() {
		int[] array = { 1, 9, 6, 18, 2 };
		int[] actual_result = mass.reversArray(array);
		int[] expected_result = { 2, 18, 6, 9, 1 };
		Assert.assertEquals(expected_result, actual_result, "Arrays are NOT equals");
	}

	@Test(expectedExceptions = ArithmeticException.class)
	public void testDivisionAndException() {
		double actual_result = mass.divisionOfElements();
		double expected_result = 0.0083;
		Assert.assertEquals(expected_result, actual_result, 0.0001);
	}

	@Test
	public void testNullObj() {
		Assert.assertNull(massNull, "Is not NULL");
	}

	@Test
	public void testNotNullObj() {
		Assert.assertNotNull(mass, "Is not NULL");
	}

	@Test
	public void testAverageForArray() {
		double actual_result = mass.averageForArray();
		double expected_result = 3.0;
		Assert.assertEquals(actual_result, expected_result, "Average is NOT equals");

	}

	@Test
	public void testAverageForArrayNotEquals() {
		double actual_result = mass.averageForArray();
		double expected_result = 5.0;
		Assert.assertNotEquals(actual_result, expected_result, "Average is NOT equals");

	}

	@Test
	public void testAverageForArrayTrue() {
		boolean flag = false;
		double actual_result = mass.averageForArray();
		double expected_result = 3.0;
		if (actual_result == expected_result) {
			flag = true;
		}
		Assert.assertTrue(flag, "Is not TRUE");
	}

	@Test
	public void testAverageForArrayFalse() {
		boolean flag = true;
		double actual_result = mass.averageForArray();
		double expected_result = 4.0;
		if (actual_result != expected_result) {
			flag = false;
		}
		Assert.assertFalse(flag, "Is not False");
	}

	@Test
	public void testAsserEqualsForArrays() {
		int[] expected_result = { 1, 2, 3, 4, 5 };
		Assert.assertEquals(mass.array, expected_result, "Arrays are NOT same");
	}

	@Test
	public void testAsserEqualsNoOrderForArrays() {
		int[] array = { 5, 2, 3, 4, 1 };
		Integer[] actual_array = mass.intToInteger(array);
		Integer[] expected_result = { 1, 2, 3, 4, 5 };
		Assert.assertEqualsNoOrder(actual_array, expected_result, "Arrays are NOT same");
	}

	@Test
	public void textAmountOfEvenElements() {
		int actual_result = mass.getAmountOfEvenElements();
		int expected_result = 2;
		Assert.assertEquals(actual_result, expected_result, "Incorrect amount of Even Elements");
	}

	@Test
	public void testAmountOfEvenElementsNotEquals() {
		int actual_result = mass.getAmountOfEvenElements();
		int expected_result = 5;
		Assert.assertNotEquals(actual_result, expected_result, "Correct amount of Even Elements");
	}

	@Test
	public void testAmountOfUnEvenElementsEquals() {
		int actual_result = mass.getAmountOfUnevenElements();
		int expected_result = 3;
		Assert.assertEquals(actual_result, expected_result, "Correct amount of Uneven Elements");
	}

	@Test
	public void testAmountOfUnevenElementsNotEquals() {
		int actual_result = mass.getAmountOfUnevenElements();
		int expected_result = 4;
		Assert.assertNotEquals(actual_result, expected_result, "Correct amount of Even Elements");
	}

	@Test
	public void testGetArrayAfterMultiplyingEachThirdElementTrue() {
		boolean flag = false;
		int[] actual_array = mass.getArrayAfterMultiplyingEachThirdElement();
		int[] expected_array = { 1, 2, 3, 8, 5 };
		if (actual_array[3] == expected_array[3]) {
			flag = true;
		}
		Assert.assertTrue(flag, "Arrays are same");
	}

	@Test
	public void testGetArrayAfterMultiplyingEachThirdElementFalse() {
		boolean flag = true;
		int[] actual_array = mass.getArrayAfterMultiplyingEachThirdElement();
		int[] expected_array = { 1, 2, 3, 7, 5 };
		if (actual_array[3] != expected_array[3]) {
			flag = false;
		}
		Assert.assertFalse(flag, "Arrays are NOT same");
	}

	@Test
	public void testGetSummMinAndMaxElementsEquals() {
		int actual_result = mass.getSummMinAndMaxElements();
		int expected_result = 6;
		Assert.assertEquals(actual_result, expected_result);
	}

	@Test
	public void testGetSummMinAndMaxElementsNotEquals() {
		int actual_result = mass.getSummMinAndMaxElements();
		int expected_result = 9;
		Assert.assertNotEquals(actual_result, expected_result);
	}

	@Test
	public void testHasAscendingArrayTrue() {
		Assert.assertTrue(mass.hasAscendingArray(), "Arrays is NOT ascending");
	}

	@Test
	public void testHasAscendingArrayFalse() {
		int[] array = { 1, 2, 2, 4, 1 };
		boolean actual_result = mass.hasAscendingArray(array);
		Assert.assertFalse(actual_result, "Arrays is ascending");
	}

	@Test
	public void testCircularShiftingOfElementsEquals() {
		int[] actual_array = mass.circularShiftingOfElements();
		int[] expected_array = { 4, 5, 1, 2, 3 };
		Assert.assertEquals(actual_array, expected_array, "Arrays are NOT same");
	}

	@Test
	public void testCircularShiftingOfElementsNotEquals() {
		int[] actual_array = mass.circularShiftingOfElements();
		int[] expected_array = { 3, 4, 5, 1, 2 };
		Assert.assertNotEquals(actual_array, expected_array, "Arrays are same");
	}

}
