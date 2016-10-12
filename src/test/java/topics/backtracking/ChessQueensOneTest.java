package topics.backtracking;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import junit.framework.TestCase;

/**
 * ChessQueensOne JUnit tests
 * @author viceg
 */
public class ChessQueensOneTest extends TestCase {
	private static Logger log = LoggerFactory.getLogger(ChessQueensOneTest.class);
	private ChessQueensOne chess;
	
	/**
	 * Initializes the object to perform tests
	 */
	@Before
	public void setUp() {
		log.trace("Chess Queens One Tests - Setup");
	}
	
	/**
	 * Ends the object to perform tests
	 */
	@After
	public void tearDown() {
		log.trace("Chess Queens One - Teardown");
	}
	
	/**
	 * Indicates whether it is possible to place all the queens at least one for a board 4x4
	 */
	@Test
	public void testChessQueensOk() {
		chess = new ChessQueensOne(4);
		chess.backtracking(0);
		boolean result = chess.isSolution();
		assertEquals(true, result);
	}
	
	/**
	 * Indicates whether it is possible to place all the queens at least one for a board 3x3
	 */
	@Test
	public void testChessQueensNo() {
		chess = new ChessQueensOne(3);
		chess.backtracking(0);
		boolean result = chess.isSolution();
		assertEquals(false, result);
	}
	
}
