package topics.backtracking;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Permutations JUnit tests
 * @author viceg
 */
public class PermutationsTest {
	private static Logger log = LoggerFactory.getLogger(PermutationsTest.class);
	private Permutations permutations;
	
	/**
	 * Initializes the object to perform tests
	 */
	@Before
	public void setUp() {
		log.trace("Permutations Tests - Setup");
	}
	
	/**
	 * Ends the object to perform tests
	 */
	@After
	public void tearDown() {
		log.trace("Permutations Tests - Teardown");
	}
	
	/**
	 * Calculates the number of permutations for 4 elements
	 */
	@Test
	public void testPermutations() {
		permutations = new Permutations(4);
		permutations.backtracking(0);
		int result = permutations.getNumberOfPermutations();
		assertEquals(24, result);
	}
	
	/**
	 * Calculates the number of permutations for 5 elements
	 */
	@Test
	public void testPermutations2() {
		permutations = new Permutations(5);
		permutations.backtracking(0);
		int result = permutations.getNumberOfPermutations();
		assertEquals(120, result);
	}
	
}
