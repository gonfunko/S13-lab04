package edu.ucsb.cs56.S13.lab04.sanchitg94;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** test class for College

@author Sanchit Gupta
@version CS56, S13, lab04
@see College

*/

public class CollegeTest {

    @Test
	public void test_DefaultConstructor_and_getters() {
	
	College c = new College();
	assertEquals("UCSB",c.getName());
	assertEquals(21000,c.getNum());
	
    }
    
    @Test
	public void test_TwoArgConstructor_and_getters_SLO() {
	
	
	College c = new College("SLO",15000);
	assertEquals("SLO",c.getName());
	assertEquals(15000,c.getNum());
	
    }

    @Test
	public void test_TwoArgConstructor_UCLA() {
		
	College c = new College("UCLA",23000);
	assertEquals("UCLA",c.getName());
	assertEquals(23000,c.getNum());
	
    }

    @Test
	public void test_toString_UCSB() {
	
	College c = new College();
	assertEquals("UCSB, 21000 Students",c.toString());
    }

    @Test
	public void test_toString_SLO() {
		
	College c = new College("SLO", 15000);
	assertEquals("SLO, 15000 Students",c.toString());
	
    }

    @Test
	public void test_toString_UCLA() {
		
	College c = new College("UCLA",23000);
	assertEquals("UCLA, 23000 Students",c.toString());	
    }

    @Test
	public void test_equals_equal1() {
		
	College c1 = new College("UCSB",21000);
	College c2 = new College("UCSB",21000);
	assertTrue(c1.equals(c2));
    }

    @Test
	public void test_equals_equal2() {
		
	College c1 = new College();
	College c2 = new College();
	assertTrue(c1.equals(c2));
    }

    @Test
	public void test_equals_notequal() {
		
	College c1 = new College("UCSB",21000);
	College c2 = new College("UCLA",23000);
	assertFalse(c1.equals(c2));
    }


}