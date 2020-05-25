import org.junit.*;
import static org.junit.Assert.*;

import battleship.*;
import io.*;

public class SeaTest {

    private Sea sea1;
    private Sea sea2;
    private Ship sh1;
    private Ship sh2;
    private Position p1;
    
    @Before
    public void initObjects() {
        this.sea1 = new Sea(10, 10);
        this.sea2 = new Sea(5, 15);
        this.sh1 = new Ship(4);
        this.sh2 = new Ship(3);
        this.p1 = new Position(6, 8);

    }
    
    @Test
    public void seaCreationTest() {
        assertEquals(0, sea1.getLifePointsOnBoard());
        sea1.addShipVertically(sh1, new Position(0,0));
        assertEquals(4, sea1.getLifePointsOnBoard());
    }

    @Test
    public void lifePointDecreseWhenShootForFirstTime(){
        sea1.addShipHorizontally(sh1, new Position(0,0));
        assertEquals(4, sea1.getLifePointsOnBoard());
        assertEquals(Answer.HIT, sea1.shoot(new Position(0,0)));
        assertEquals(3, sea1.getLifePointsOnBoard());
    }

    @Test
    public void lifePointDoNotDecreseWhenShootForSecondTime(){
        sea1.addShipHorizontally(sh1, new Position(0,0));
        assertEquals(4, sea1.getLifePointsOnBoard());
        assertEquals(Answer.HIT, sea1.shoot(new Position(0,0)));
        assertEquals(3, sea1.getLifePointsOnBoard());
        assertEquals(Answer.MISSED, sea1.shoot(new Position(0,0)));
        assertEquals(3, sea1.getLifePointsOnBoard());
    }
    
    @Test
    public void addingAShipHorizontallyTest() {
        sea1.addShipHorizontally(sh2, new Position(0,0));
        assertEquals(3, sea1.getLifePointsOnBoard());
        assertEquals(Answer.HIT, sea1.shoot(new Position(0,0)));
        assertEquals(2, sea1.getLifePointsOnBoard());
        assertEquals(Answer.MISSED, sea1.shoot(new Position(0,1)));
        assertEquals(2, sea1.getLifePointsOnBoard());
        assertEquals(Answer.HIT, sea1.shoot(new Position(1,0)));
        assertEquals(Answer.SUNK, sea1.shoot(new Position(2,0)));
        assertEquals(0, sea1.getLifePointsOnBoard());
    }
    
    @Test
    public void addingAShipVerticallyTest() {
        sea1.addShipVertically(sh2, new Position(0,0));
        assertEquals(3, sea1.getLifePointsOnBoard());
        assertEquals(Answer.HIT, sea1.shoot(new Position(0,0)));
        assertEquals(2, sea1.getLifePointsOnBoard());
        assertEquals(Answer.MISSED, sea1.shoot(new Position(1,0)));
        assertEquals(2, sea1.getLifePointsOnBoard());
        assertEquals(Answer.HIT, sea1.shoot(new Position(0,1)));
        assertEquals(Answer.SUNK, sea1.shoot(new Position(0,2)));
        assertEquals(0, sea1.getLifePointsOnBoard());
    }
    
    @Test
    public void positionValidityTest() {
        assertTrue(sea1.validPosition(p1));
        assertFalse(sea2.validPosition(p1));
    }
    
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(SeaTest.class);
    }
    
}
