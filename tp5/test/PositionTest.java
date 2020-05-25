import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Before;

import io.*;

public class PositionTest {
	
	private Position p1;
	private Position p2;
	private Position p3;
	private Position p4;
	private Position p5;
	
	@Before
    public void initObjects() {
		this.p1 = new Position(2,3);
		this.p2 = new Position(2,3);
		this.p3 = new Position(7,3);
		this.p5 = new Position(2,9);
		this.p4 = new Position(8,9);
    }
	
	@Test
	public void positionCreationTest() {
		//Position p1 = new Position(2,3);
		//Position p2 = new Position(2,3);
		assertEquals(2, p1.getX());
		assertEquals(3, p2.getY());
	}
	
	@Test
	public void positionEquality() {/**
		Position p1 = new Position(2,3);
		Position p2 = new Position(2,3);
		Position p3 = new Position(7,3);
		Position p5 = new Position(2,9);
		Position p4 = new Position(8,9);
		*/
		assertTrue(p1.equals(p2));
		assertFalse(p1.equals(p3));
		assertFalse(p2.equals(p4));
		assertFalse(p2.equals(p5));
	}
	
	public static junit.framework.Test suite() {
		return new junit.framework.JUnit4TestAdapter(PositionTest.class);
	}
}
