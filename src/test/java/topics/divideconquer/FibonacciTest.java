package topics.divideconquer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Fibonacci JUnit tests
 * @author viceg
 */
public class FibonacciTest {
	private static Fibonacci fib;
	
	/**
	 * Initializes the object to perform tests
	 */
	@Before
	public void setUp() {
		fib = new Fibonacci();
	}
	
	/**
	 * Calculates the Fibonacci of a number in an iterative way
	 */
	@Test
	public void fibonacciIterative() {
		int result = fib.fib1(11);
		assertEquals(89, result);
	}	
	
	/**
	 * Calculates the Fibonacci of a number in an iterative way
	 */
	@Test
	public void fibonacchiIterative2() {
		int[]v = new int[61]; //it can calculate until n=60
		int result = fib.fib2(11, v);
		assertEquals(89, result);
	}	
	
	/**
	 * Calculates the Fibonacci of a number in a recursive way
	 */
	@Test
	public void fibonacchiRecursive() {
		int result = fib.fib3(11);
		assertEquals(89, result);
	}	

	/**
	 * Calculates the Fibonacci of a number in a recursive way
	 */
	@Ignore("Not ready yet")
	@Test
	public void fibonacciRecursive2() {
		int result = fib.fib4(11);
		assertEquals(89, result);
	}	
	
	/**
	 * Calculates the Fibonacci of a number in a sophisticated way
	 */
	@Test
	public void fibonacciSophisticated() {
		int result = fib.fib5(11);
		assertEquals(89, result);
	}
	
}
