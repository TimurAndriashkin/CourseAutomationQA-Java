import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import first_package.Massive;

public class Massive_Test {
	private Massive mass;
	Massive massNull;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	@Before
	public void setUp() throws Exception {
		int[] array = { 1, 2, 3, 4, 5 };
		mass = new Massive(array);
	}

	@After
	public void tearDown() throws Exception {
		mass.clearArray();
		mass = null;
	}

	@Test
	public void testGetSum() {
		int expected_result = 15;
		int actual_result = mass.sumOfElements();
		assertEquals(expected_result, actual_result);
	}

	@Test
	public void testSameObj() {
		Massive mass2 = mass;
		assertSame("Objects are NOT same", mass, mass2);
	}

	@Test
	public void testNotSameObj() {
		Massive mass2 = new Massive();
		assertNotSame("Objects are same", mass, mass2);
	}

	@Test
	public void testReversArray() {
		mass = new Massive();
		int[] array = { 1, 9, 6, 18, 2 };
		int[] actual_result = mass.reversArray(array);
		int[] expected_result = { 2, 18, 6, 9, 1 };
		assertArrayEquals("Arrays are NOT equals", expected_result, actual_result);
	}

	@Test
	public void testDiffSumTrue() {
		boolean flag = false;
		int expected_result = -15;
		int actual_result = mass.diffOfElements();
		if (expected_result == actual_result) {
			flag = true;
		}
		assertTrue("Is not TRUE", flag);
	}

	@Test(expected = ArithmeticException.class)
	public void testDivisionAndException() {
		double actual_result = mass.divisionOfElements();
		double expected_result = 0.0083;
		assertEquals(expected_result, actual_result, 0.0001);
	}

	@Ignore("This case is ignored")
	@Test
	public void testMultiplicationFalse() {
		boolean flag = true;
		int expected_result = 120;
		int actual_result = mass.multiplicationOfElements();
		if (expected_result == actual_result) {
			flag = false;
		}
		assertFalse("Is not FALSE", flag);
	}

	@Test
	public void testNullObj() {
		assertNull("Is not NULL", massNull);
	}

	@Test
	public void testNotNullObj() {
		assertNotNull("Is not NULL", mass);
	}

	@Test
	public void testGetSumAssertThat() {
		int[] array2 = { 1, 2, 3, 4, 5 };
		assertThat(mass.length, is(array2.length));
	}

}
