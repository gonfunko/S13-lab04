package edu.ucsb.cs56.S13.lab04.bnieder;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** test class for CBev

@author Phill Conrad
@version CS56, S13, lab04
@see CBev

*/

public class CBevTest {

    public static final double tol = 0.0001;

    
    @Test
	public void test_TwoArgConstructor_and_getters() {
	
	
	CBev cb = new CBev("Diet Coke",2.9);
	assertEquals("Diet Coke",cb.getName());
	assertEquals(2.9,cb.getMpo(),tol);
	
    }

    @Test
	public void test_toString() {
	CBev cb = new CBev("Diet Coke",2.9);
	assertEquals("Diet Coke (2.9 mg/oz)",cb.toString());
    }

    @Test
	public void test_equals_equal1() {
		
	CBev cb1 = new CBev("Diet Coke",2.9);
	CBev cb2 = new CBev("Diet Coke",2.9);
	assertTrue(cb1.equals(cb2));
    }

    @Test
	public void test_equals_notequal() {
	CBev cb1 = new CBev("Diet Coke",2.9);
	CBev cb2 = new CBev("Vanilla Latte",9.4);
	assertFalse(cb1.equals(cb2));
    }


} // class CBevTest.java