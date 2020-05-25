import org.junit.*;
import static org.junit.Assert.*;

import battleship.*;

public class GameTest {

	@Test
	public void returnNullIsThereIsNoSecondSea() {
		Sea sea1 = new Sea(10,10);
		Game g1 = new Game(sea1);
		assertEquals(sea1, g1.getSea1());
		assertEquals(null, g1.getSea2());
	}
	
	@Test
	public void returnSecondSeaWhenThereIsSecondSea() {
		Sea sea2 = new Sea(4,8);
		Sea sea3 = new Sea(8,8);
		Game g2 = new Game(sea2, sea3);
		assertEquals(sea2, g2.getSea1());
		assertEquals(sea3, g2.getSea2());
	}
	
	public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(GameTest.class);
    }
}
