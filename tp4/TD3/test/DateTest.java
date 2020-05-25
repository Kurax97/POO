import org.junit.*;
import static org.junit.Assert.*;

import date.Date;
import date.Month;

public class DateTest {

    @Test
    public void testCorrectDateCreation() {
	Date d1 = new Date(2, Month.MAY, 2000);
	assertEquals(2, d1.getDay());
	assertEquals(Month.MAY, d1.getMonth());
	assertEquals(2000, d1.getYear());
    }

    @Test
    public void testTomorrowIsTheDayAfter() {
	Date d1 = new Date(1, Month.MAY, 2000);
	Date d2 = d1.tomorrow();
	Date d3 = new Date(31, Month.DECEMBER, 2012);
	Date d4 = d3.tomorrow();
	assertEquals(new Date(2, Month.MAY, 2000), d2);
	assertEquals(new Date(1, Month.JANUARY, 2013), d4);
    }

    @Test
    public void testAfterNDaysWhenNPositive(){
	Date d1 = new Date(18, Month.FEBRUARY, 2020);
	Date d2 = d1.afterNDays(4);
	Date d3 = d1.afterNDays(367);
	assertEquals(new Date(22, Month.FEBRUARY, 2020), d2);
	assertEquals(new Date(19, Month.FEBRUARY, 2021), d3);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testAfterNdaysWhenSIsNegative(){
	Date d1 = new Date(2, Month.MAY, 2000);
	d1.afterNDays(-1);
    }

    @Test 
    public void testCompare() {
	Date d1 = new Date(1, Month.MAY, 2000);
	Date d2 = new Date(31, Month.DECEMBER, 2012);
	Date d3 = d1;
	assertTrue(d1.equals(d3));
	assertFalse(d1.equals(d2));
	assertEquals(1, d1.compare(d2));
	assertEquals(-1, d2.compare(d1));
	assertEquals(0, d3.compare(d1));
    }

    @Test
    public void testIsLeapYear() {
	Date d1 = new Date(2, Month.MAY, 2020);
	Date d2 = new Date(18, Month.JULY, 2019);
	assertEquals(true, d1.isLeapYear());
	assertEquals(false, d2.isLeapYear());
    }

    @Test
    public void testGapBetweenTwoDates() {
	Date d1 = new Date(1, Month.MAY, 2020);
	Date d2 = new Date(18, Month.JULY, 2020);
	assertEquals(78, d1.gap(d2));
    }
    // ---pour permettre l'exécution des test---
     public static junit.framework.Test suite() {
	return new junit.framework.JUnit4TestAdapter(DateTest.class);
     }
	  
}
	
