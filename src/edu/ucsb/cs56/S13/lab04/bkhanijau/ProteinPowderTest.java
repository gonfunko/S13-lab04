package edu.ucsb.cs56.S13.lab04.bkhanijau;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** test class for ProteinPowder

@author Bhanu Khanijau
@version CS56, S13, lab04, 5/1/13
@see ProteinPowder

*/

public class ProteinPowderTest {

    @Test
	public void test_DefaultConstructor_and_getters() {
	
	ProteinPowder iso = new ProteinPowder();
	assertEquals("Isopure",iso.getBrand());
	assertEquals(25,iso.getGramsProtein());
	
    }
    
    @Test
	public void test_TwoArgConstructor_and_getters() {
	
	
	ProteinPowder gold = new ProteinPowder("Gold Standard",24);
	assertEquals("Gold Standard",gold.getBrand());
	assertEquals(24,gold.getGramsProtein());
	
    }

    @Test
	public void test_toString_default() {
	
	ProteinPowder iso = new ProteinPowder();
	assertEquals("Isopure, 25",iso.toString());
    }

    @Test
	public void test_toString_twoArg() {
		
	ProteinPowder gold = new ProteinPowder("Gold Standard",24);
	assertEquals("Gold Standard, 24",gold.toString());
	
    }

    @Test
	public void test_equals_default() {
		
	ProteinPowder iso1 = new ProteinPowder();
	ProteinPowder iso2 = new ProteinPowder();
	assertTrue(iso1.equals(iso2));
    }

    @Test
	public void test_equals_twoArg() {
		
	ProteinPowder gold1 = new ProteinPowder("Gold Standard", 24);
	ProteinPowder gold2 = new ProteinPowder("Gold Standard", 24);
	assertTrue(gold1.equals(gold2));
    }

    @Test
	public void test_equals_notequal() {
		
	ProteinPowder iso = new ProteinPowder();
	ProteinPowder gold = new ProteinPowder("Gold Standard", 24);
	assertFalse(iso.equals(gold));
    }

    @Test
    public void test_isPossible_yes(){

    	ProteinPowder p = new ProteinPowder("Standard", 24);
    	assertTrue(p.isPossibleProtein());
    }

    @Test
    public void test_isPossible_no(){

    	ProteinPowder p = new ProteinPowder("Standard", -42);
    	assertFalse(p.isPossibleProtein());
    }


}