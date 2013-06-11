package edu.ucsb.cs56.S13.lab04.iDarvis;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** test class for RadioStation

@author Daryl Pham
@version CS56, S13, lab04
@see Car

*/

public class CarTest {

    public static final double tol = 0.01;

    @Test
	public void test_DefaultConstructor_and_getters() {
	
	
	Car r = new Car();
	assertEquals("Toyota",r.getCarName());
	assertEquals(1998,r.getYear(),tol);
	
    }
    
    @Test
	public void test_TwoArgConstructor_and_getters_Ford() {
	
	
	Car r = new Car("Ford",2012);
	assertEquals("Ford",r.getCarName());
	assertEquals(2012,r.getYear(),tol);
	
    }

    @Test
	public void test_TwoArgConstructor_BMW() {
		
	Car r = new Car("BMW",2001);
	assertEquals("BMW",r.getCarName());
	assertEquals(2001,r.getYear(),tol);
	
    }

    @Test
	public void test_toString_Toyota() {
	
	Car r = new Car();
	assertEquals("[Toyota, Manufactured: 1998]",r.toString());
    }

    @Test
	public void test_toString_BMW() {
		
	Car r = new Car("BMW",2001);
	assertEquals("[BMW, Manufactured: 2001]",r.toString());
	
    }

    @Test
	public void test_equals_equal1() {
		
	Car r1 = new Car("BMW",2001);
	Car r2 = new Car("BMW",2001);
	assertTrue(r1.equals(r2));
    }

    @Test
	public void test_equals_equal2() {
		
	Car r1 = new Car();
	Car r2 = new Car();
	assertTrue(r1.equals(r2));
    }

    @Test
	public void test_equals_notequal() {
		
	Car r1 = new Car();
	Car r2 = new Car("BMW",2001);
	assertFalse(r1.equals(r2));
    }


} // class Car.java
