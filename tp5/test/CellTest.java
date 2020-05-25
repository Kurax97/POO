import org.junit.*;
import static org.junit.Assert.*;

import battleship.*;
import io.Answer;

public class CellTest {
	
	private Cell c1;
	private Cell c2;
	private Ship sh1;
	private Ship sh2;
	private Ship sh3;
	
	@Before
    public void initObjects() {
		this.c1 = new Cell();
		this.c2 = new Cell();
		this.sh1 = new Ship(3);
		this.sh2 = new Ship(5);
		this.sh3 = new Ship(1);
    }

	@Test
	public void cellCreationTest() {
		assertEquals(null, c1.getShip());
		assertFalse(c1.hasBeenShot());
	}
	
	@Test
	public void testAddShip() {
		assertTrue(c1.isEmpty());
		assertEquals(null, c1.getShip());
		c1.add(sh1);
		assertFalse(c1.isEmpty());
		assertEquals(sh1, c1.getShip());
		c1.add(sh2);
		assertEquals(sh1, c1.getShip());
	}
	
	@Test
	public void firstShotDecreseLifePoints() {
		assertEquals(3, sh1.getLifePoints());
		c1.add(sh1);
		assertEquals(Answer.HIT ,c1.shot());
		assertEquals(2, sh1.getLifePoints());
		assertEquals(1, sh3.getLifePoints());
		c2.add(sh3);
		assertEquals(Answer.SUNK ,c2.shot());
		assertTrue(sh3.isSunk());
	}
	
	@Test
	public void secondShotDoNotDecreseLifePoints() {
		assertEquals(3, sh1.getLifePoints());
		c1.add(sh1);
		assertEquals(Answer.HIT ,c1.shot());
		assertEquals(2, sh1.getLifePoints());
		c1.shot();
		assertEquals(2, sh1.getLifePoints());
	}

	public static junit.framework.Test suite() {
		return new junit.framework.JUnit4TestAdapter(CellTest.class);
	}
	
	
}