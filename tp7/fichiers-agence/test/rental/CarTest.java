package rental;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest {
 
	private Car c1;
	private Car c2;


    
	@Before 
	public void before() {
		this.c1 = new Car("brand1","model1",2015,100.0f, 2);
		this.c2 = new Car("brand2","model2",2000,200.0f, 5);
	}

	
	@Test
	public void testGetBrand() {
		assertEquals("brand1",this.c1.getBrand());
		assertEquals("brand2",this.c2.getBrand());
	}

	@Test
	public void testGetModel() {
		assertEquals("model1",this.c1.getModel());
		assertEquals("model2",this.c2.getModel());
	}

	@Test
	public void testGetDailyPrice() {
	    assertEquals(100.0f,this.c1.getDailyPrice(),0.0001);
	    assertEquals(200.0f,this.c2.getDailyPrice(),0.0001);
	}

	@Test
	public void testGetProductionYear() {
	    assertEquals(2015,this.c1.getProductionYear());
	    assertEquals(2000,this.c2.getProductionYear());
	}
	
	@Test
	public void testGetnbPassengers() {
		assertEquals(2,this.c1.getNbPassengers());
	    assertEquals(5,this.c2.getNbPassengers());
	}

	@Test
	public void testEquals() {
		Vehicle c3 = new Car("brand1","model1",2015,100.0f, 2);
		Vehicle c4 = new Car("brand1","model1",2015,200.0f, 5);
		assertTrue(c1.equals(c3));
		assertFalse(c1.equals(c2));
		assertFalse(c1.equals(c4));
		assertFalse(c1.equals(new Object()));
	}

    // ---Pour permettre l'execution des tests ----------------------
    public static junit.framework.Test suite() {
	return new junit.framework.JUnit4TestAdapter(rental.CarTest.class);
    }

}
