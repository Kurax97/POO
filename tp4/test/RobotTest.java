import org.junit.*;
import static org.junit.Assert.*;

import example.Robot;
import example.util.Box;
import example.util.ConveyerBelt;

public class RobotTest {

	@Test
	public void testTakeBox() {
		Robot someRobot = new Robot();
		Box someBox = new Box(10);
		Box otherBox = new Box(15);
		someRobot.take(someBox);
		assertSame(someRobot.getCarriedBox(), someBox);
		someRobot.take(otherBox);
		assertSame(someRobot.getCarriedBox(), someBox);
	}

	@Test
	public void testCarryBox() {
		Robot someRobot = new Robot();
		Box someBox = new Box(10);
		assertFalse(someRobot.carryBox());
		someRobot.take(someBox);
		assertTrue(someRobot.carryBox());
	}
	
	@Test
	public void testIfputOnIsOkRobotHasNoBox(){
		Robot someRobot = new Robot();
		Box someBox = new Box(10);
		ConveyerBelt someBelt = new ConveyerBelt(30);
		someRobot.take(someBox);
	 	assertSame("ok", someRobot.putOn(someBelt));
		assertFalse(someRobot.carryBox());	
	}
	
	@Test
	public void testIfRobotHasNoBoxReturnIsNoBox(){
		Robot someRobot = new Robot();
		ConveyerBelt someBelt = new ConveyerBelt(30);
		assertSame("no box", someRobot.putOn(someBelt));
	}
	
	@Test
	public void testIfBelfIsFullRobotStillHasTheBox(){
		Robot someRobot = new Robot();
		Box someBox = new Box(10);
		Box secondBox = new Box(15);
		Box thirdBox = new Box(12);
		ConveyerBelt someBelt = new ConveyerBelt(30);
		someRobot.take(someBox);
		someRobot.putOn(someBelt);
		someRobot.take(secondBox);
		someRobot.putOn(someBelt);
		assertFalse(someRobot.carryBox());
		someRobot.take(thirdBox);
		assertSame("belt full", someRobot.putOn(someBelt));
		assertTrue(someRobot.carryBox());
	}

	@Test
	public void testIfBoxIsHeavierThanTheBeltRobotStillHasBox(){
		Robot someRobot = new Robot();
		Box someBox = new Box(50);
		ConveyerBelt someBelt = new ConveyerBelt(30);
		someRobot.take(someBox);
		assertSame("box too heavy", someRobot.putOn(someBelt));
		assertTrue(someRobot.carryBox());
	}

	public static junit.framework.Test suite() {
	return new junit.framework.JUnit4TestAdapter(RobotTest.class);
     }

}
