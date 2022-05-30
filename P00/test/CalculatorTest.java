import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Muhammad Haykal Bin Ismail
 * Student ID: 21040411
 * Class: E66K
 * Date/Time created: Monday 30-05-2022 18:38
 */

/**
 * @author hxyka
 *
 */
public class CalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}


	@Test
	public final void testAdd() {
		//fail("Not yet implemented");
		int a = 10;
		int b = 15;
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		assertEquals (25, actual);
	}
	
	
	@Test
	public final void testSubtract() {
		int a = 10;
		int b = 5;
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		assertEquals (5, actual);
	}
	
	
	@Test
	public final void testMultiply() {
		int a = 10;
		int b = 5;
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		assertEquals (50, actual);
	}
	

	@Test
	public final void testDivide() {
		int a = 100;
		int b = 10;
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		assertEquals (10, actual);
	}
	

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
}

