package topics.divideconquer;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Mode JUnit tests
 * @author viceg
 */
public class ModeTest {
	private static Mode elem;
	
	/**
	 * Initializes the object to perform tests
	 */
	@Before
	public static void setUp() {
		elem = new Mode();
	}
	
	/**
	 * Calculates the mode using an iterative approach
	 */
	@Test
	public void modeIterative() {
		int[] v = {3, 7, 7, 1, 7, 3};
		int[] mo = new int[2];
		elem.mode1(v, mo);
		assertEquals(7, mo[0]);
		assertEquals(3, mo[1]);
	}	
	
	/**
	 * Calculates the mode using a recursive approach
	 */
	@Ignore("Not ready yet")
	@Test
	public void modeRecursive() {
		int[] v = {3, 7, 7, 1, 7, 3};
		int[] mo = new int[2];
		elem.mode2(v, mo);
		assertEquals(7, mo[0]);
		assertEquals(3, mo[1]);
	}	
	
}
