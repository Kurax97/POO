import org.junit.*;
import static org.junit.Assert.*;

import battleship.Ship;

public class ShipTest {

    @Test
    public void testWhenTouchedLifePointsDecresed() {
    	Ship sh1 = new Ship(3);
    	assertEquals(3, sh1.getLifePoints());
    	assertEquals(3, sh1.getLength());
    	sh1.decreaseLP();
    	assertEquals(2, sh1.getLifePoints());
    }
    
    @Test
    public void testIsSunkWhenLifePointsAreZero() {
    	Ship sh1 = new Ship(2);
    	assertFalse(sh1.isSunk());
    	sh1.decreaseLP();
    	sh1.decreaseLP();
    	assertTrue(sh1.isSunk());
    }
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(ShipTest.class);
    }
}
