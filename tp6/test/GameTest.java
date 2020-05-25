import org.junit.*;


import static org.junit.Assert.*;

import pfc.*;
import pfc.strategy.*;

public class GameTest {
	
	@Test
	public void returnNullWhenSameStrategy() {
		Player p1 = new Player("Simo", new AlwaysPaper());
		Player p2 = new Player("Lyes", new AlwaysPaper());
		Player p3 = new Player("Simo", new AlwaysRock());
		Player p4 = new Player("Lyes", new AlwaysRock());
		Player p5 = new Player("Simo", new AlwaysScissors());
		Player p6 = new Player("Lyes", new AlwaysScissors());
		Game g1 = new Game(p1, p2);
		Game g2 = new Game(p3, p4);
		Game g3 = new Game(p5, p6);
		assertEquals("Match null", g1.play(2));
		assertEquals("Match null", g2.play(2));
		assertEquals("Match null", g3.play(2));
	}
	
	@Test
	public void PaperRockStrategyTest() {
		Player p1 = new Player("Simo", new AlwaysPaper());
		Player p2 = new Player("Lyes", new AlwaysRock());
		Game g1 = new Game(p1, p2);
		assertEquals(p1, g1.play(2));
	}
	
	@Test
	public void PaperScissorsStrategyTest() {
		Player p1 = new Player("Simo", new AlwaysPaper());
		Player p2 = new Player("Lyes", new AlwaysScissors());
		Game g1 = new Game(p1, p2);
		assertEquals(p2, g1.play(2));
	}
	
	@Test
	public void ScissorsRockStrategyTest() {
		Player p1 = new Player("Simo", new AlwaysRock());
		Player p2 = new Player("Lyes", new AlwaysScissors());
		Game g1 = new Game(p1, p2);
		assertEquals(p1, g1.play(2));
	}


    @Test
    public void playOneRoundPaperPaperTest(){
		Player p1 = new Player("Simo", new AlwaysPaper());
		Player p2 = new Player("Lyes", new AlwaysPaper());
		Game g1 = new Game(p1, p2);
        g1.playOneRound();
        assertEquals(1, p1.getPoints());
        assertEquals(1, p2.getPoints());
        g1.playOneRound();
        assertEquals(2, p1.getPoints());
        assertEquals(2, p2.getPoints());
    }


    @Test
    public void playOneRoundRockRockTest(){
		Player p1 = new Player("Simo", new AlwaysRock());
		Player p2 = new Player("Lyes", new AlwaysRock());
		Game g1 = new Game(p1, p2);
        g1.playOneRound();
        assertEquals(1, p1.getPoints());
        assertEquals(1, p2.getPoints());
        g1.playOneRound();
        assertEquals(2, p1.getPoints());
        assertEquals(2, p2.getPoints());
    }

    @Test
    public void playOneRoundScissorsTest(){
		Player p1 = new Player("Simo", new AlwaysScissors());
		Player p2 = new Player("Lyes", new AlwaysScissors());
		Game g1 = new Game(p1, p2);
        g1.playOneRound();
        assertEquals(1, p1.getPoints());
        assertEquals(1, p2.getPoints());
        g1.playOneRound();
        assertEquals(2, p1.getPoints());
        assertEquals(2, p2.getPoints());
    }

    @Test
    public void playOneRoundRockScissorsTest(){
		Player p1 = new Player("Simo", new AlwaysRock());
		Player p2 = new Player("Lyes", new AlwaysScissors());
		Game g1 = new Game(p1, p2);
        g1.playOneRound();
        assertEquals(2, p1.getPoints());
        assertEquals(0, p2.getPoints());
        g1.playOneRound();
        assertEquals(4, p1.getPoints());
        assertEquals(0, p2.getPoints());
    }
	
	
    @Test
    public void playOneRoundRockPaperTest(){
		Player p1 = new Player("Simo", new AlwaysRock());
		Player p2 = new Player("Lyes", new AlwaysPaper());
		Game g1 = new Game(p1, p2);
        g1.playOneRound();
        assertEquals(2, p2.getPoints());
        assertEquals(0, p1.getPoints());
        g1.playOneRound();
        assertEquals(4, p2.getPoints());
        assertEquals(0, p1.getPoints());
    }

    @Test
    public void playOneRoundScissorsPaperTest(){
		Player p1 = new Player("Simo", new AlwaysScissors());
		Player p2 = new Player("Lyes", new AlwaysPaper());
		Game g1 = new Game(p1, p2);
        g1.playOneRound();
        assertEquals(2, p1.getPoints());
        assertEquals(0, p2.getPoints());
        g1.playOneRound();
        assertEquals(4, p1.getPoints());
        assertEquals(0, p2.getPoints());
    }
	
	public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(GameTest.class);
    }
}
