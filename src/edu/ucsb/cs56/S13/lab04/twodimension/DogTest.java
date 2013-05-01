package edu.ucsb.cs56.S13.lab04.twodimension;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** test class for Dog

@author Wei Guo
@version CS56, S13, lab04
@see Dog

*/

public class DogTest {

    public static final double tol = 0.01;

    @Test
	public void test_DefaultConstructor_and_getters() {
	
	
	RadioStation r = new RadioStation();
	assertEquals("KCSB",r.getCallSign());
	assertEquals(91.9,r.getFrequency(),tol);
	
    }
    
    @Test
	public void test_TwoArgConstructor_and_getters_KJEE() {
	
	
	RadioStation r = new RadioStation("KJEE",92.9);
	assertEquals("KJEE",r.getCallSign());
	assertEquals(92.9,r.getFrequency(),tol);
	
    }

    @Test
	public void test_TwoArgConstructor_KTYD() {
		
	RadioStation r = new RadioStation("KTYD",990);
	assertEquals("KTYD",r.getCallSign());
	assertEquals(990,r.getFrequency(),tol);
	
    }

    @Test
	public void test_toString_KCSB() {
	
	RadioStation r = new RadioStation();
	assertEquals("[KCSB, FM 91.9]",r.toString());
    }

    @Test
	public void test_toString_KJEE() {
		
	RadioStation r = new RadioStation("KJEE",92.9);
	assertEquals("[KJEE, FM 92.9]",r.toString());
	
    }

    @Test
	public void test_toString_KTYD() {
		
	RadioStation r = new RadioStation("KTYD",990);
	assertEquals("[KTYD, AM 990]",r.toString());	
    }

    @Test
	public void test_equals_equal1() {
		
	RadioStation r1 = new RadioStation("KTYD",990);
	RadioStation r2 = new RadioStation("KTYD",990);
	assertTrue(r1.equals(r2));
    }

    @Test
	public void test_equals_equal2() {
		
	RadioStation r1 = new RadioStation();
	RadioStation r2 = new RadioStation();
	assertTrue(r1.equals(r2));
    }

    @Test
	public void test_equals_notequal() {
		
	RadioStation r1 = new RadioStation();
	RadioStation r2 = new RadioStation("KTYD",990);
	assertFalse(r1.equals(r2));
    }


} // class DogTest.java
