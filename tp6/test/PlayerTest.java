import org.junit.*;


import static org.junit.Assert.*;

import pfc.*;
import pfc.strategy.*;

public class PlayerTest{
	
	@Test
	public void testPlayerCreation() {
		Player p1 = new Player("Simo", new AlwaysPaper());
		assertEquals("Simo", p1.getName());
		assertEquals(0, p1.getPoints());
	}
	
	@Test
	public void testChoosingStrategy() {
		Player p1 = new Player("Simo", new AlwaysPaper());
		Player p2 = new Player("Lyes", new AlwaysRock());
		Player p3 = new Player("Foo", new AlwaysScissors());
		assertSame(Choice.PAPER, p1.choose());
		assertSame(Choice.ROCK, p2.choose());
		assertSame(Choice.SCISSORS, p3.choose());	
	}
	
	@Test
	public void testAddAndGetPoints() {
		Player p1 = new Player("Simo", new AlwaysPaper());
		assertEquals(0, p1.getPoints());
		p1.addPoints(2);
		assertEquals(2, p1.getPoints());
		p1.addPoints(1);
		assertEquals(3, p1.getPoints());
	}

    @Test
	public void testGetCorrectStrategy() {
		Player p1 = new Player("Simo", new AlwaysPaper());
		Player p2 = new Player("Lyes", new AlwaysRock());
		Player p3 = new Player("Foo", new AlwaysScissors());
		assertEquals(Choice.PAPER, p1.choose());
		assertEquals(Choice.ROCK, p2.choose());
		assertEquals(Choice.SCISSORS, p3.choose());
	}
	
	public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(PlayerTest.class);
    }
	
}
