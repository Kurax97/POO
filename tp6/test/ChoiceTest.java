import org.junit.*;


import static org.junit.Assert.*;

import pfc.*;
import pfc.strategy.*;

public class ChoiceTest {
	
	@Test
	public void whenCompareSameReturnZero() {
		Choice c1 = Choice.PAPER;
		Choice c2 = Choice.ROCK;
		Choice c3 = Choice.SCISSORS;
		assertEquals(0, c1.compare(c1));
		assertEquals(0, c2.compare(c2));
		assertEquals(0, c3.compare(c3));
	}
	
	@Test
	public void testComparaison() {
		Choice c1 = Choice.PAPER;
		Choice c2 = Choice.ROCK;
		Choice c3 = Choice.SCISSORS;
		assertEquals(1, c1.compare(c2));
		assertEquals(-1, c2.compare(c1));
		assertEquals(-1, c1.compare(c3));
		assertEquals(1, c3.compare(c1));
		assertEquals(1, c2.compare(c3));
		assertEquals(-1, c3.compare(c2));
		
	}
	
	public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(ChoiceTest.class);
    }
}
