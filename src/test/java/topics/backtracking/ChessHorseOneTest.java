package topics.backtracking;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import junit.framework.TestCase;

/**
 * ChessQueensOne JUnit tests
 * @author viceg
 */
public class ChessHorseOneTest extends TestCase {
	private static Logger log = LoggerFactory.getLogger(ChessHorseOneTest.class);
	private ChessHorseOne chess;
	
	/**
	 * Initializes the object to perform tests
	 */
	@Before
	public void setUp() {
		log.trace("Chess Horse One Tests - Setup");
	}
	
	/**
	 * Ends the object to perform tests
	 */
	@After
	public void tearDown() {
		log.trace("Chess Horse One - Teardown");
	}
	
	/**
	 * Indicates whether it is possible move the horse through the complete board 5x5
	 */
	@Ignore("Not ready yet")
	@Test
	public void testChessHorseOk() {
		int startingX = 0;
		int startingY = 0;
		
		chess = new ChessHorseOne(5, startingX, startingY);
		chess.backtracking(2, startingX, startingY);
		boolean result = chess.isSolution();
		assertEquals(true, result);
	}
	
	/**
	 * Indicates whether it is possible move the horse through the complete board 5x5
	 */
	@Ignore("Not ready yet")
	@Test
	public void testChessHorseNo() {
		int startingX = 1;
		int startingY = 4;
		
		chess = new ChessHorseOne(5, startingX, startingY);
		chess.backtracking(2, startingX, startingY);
		boolean result = chess.isSolution();
		assertEquals(false, result);
	}
	
	
}
