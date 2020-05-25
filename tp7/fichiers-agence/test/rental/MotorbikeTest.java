package rental;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MotorbikeTest {
 
	private Motorbike m1;
	private Motorbike m2;


    
	@Before 
	public void before() {
		this.m1 = new Motorbike("brand1","model1",2015,100.0f, 300);
		this.m2 = new Motorbike("brand2","model2",2000,200.0f, 800);
	}

	
	@Test
	public void testGetBrand() {
		assertEquals("brand1",this.m1.getBrand());
		assertEquals("brand2",this.m2.getBrand());
	}

	@Test
	public void testGetModel() {
		assertEquals("model1",this.m1.getModel());
		assertEquals("model2",this.m2.getModel());
	}

	@Test
	public void testGetDailyPrice() {
	    assertEquals(100.0f,this.m1.getDailyPrice(),0.0001);
	    assertEquals(200.0f,this.m2.getDailyPrice(),0.0001);
	}

	@Test
	public void testGetProductionYear() {
	    assertEquals(2015,this.m1.getProductionYear());
	    assertEquals(2000,this.m2.getProductionYear());
	}
	
	@Test
	public void testGetCylinder() {
		assertEquals(300,this.m1.getCylinder());
	    assertEquals(800,this.m2.getCylinder());
	}

	@Test
	public void testEquals() {
		Vehicle m3 = new Car("brand1","model1",2015,100.0f, 300);
		Vehicle m4 = new Car("brand1","model1",2015,200.0f, 600);
		assertTrue(m1.equals(m3));
		assertFalse(m1.equals(m2));
		assertFalse(m1.equals(m4));
		assertFalse(m1.equals(new Object()));
	}

    // ---Pour permettre l'execution des tests ----------------------
    public static junit.framework.Test suite() {
	return new junit.framework.JUnit4TestAdapter(rental.MotorbikeTest.class);
    }

}
