package edu.ucsb.cs56.S13.lab04.cbarbello;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** test class for PowerUsage
@author Casey Barbello
@version CS56, S13, lab04                                                      
@see PowerUsage 
*/

public class PowerUsageTest{

    @Test
    public void test_DefaultConstructor_and_getters(){
	
	PowerUsage p = new PowerUsage();
	assertEquals("Refrigerator",p.getApplianceName());
	assertEquals(725,p.getWatts());
    }

    @Test
    public void test_TwoArgConstructor_and_getters_Toaster(){
	
	PowerUsage p = new PowerUsage("Toaster",800);
	assertEquals("Toaster",p.getApplianceName());
	assertEquals(800,p.getWatts());
    }

    @Test
    public void test_toString_Toaster(){
	
	PowerUsage p = new PowerUsage("Toaster",800);
	assertEquals("Toaster",p.getApplianceName());
	assertEquals("Appliance Name and Wattage: Toaster 800",p.toString());
    }

    @Test
    public void test_equals_equal1() {

        PowerUsage p1 = new PowerUsage("Toaster",800);
        PowerUsage p2 = new PowerUsage("Toaster",800);
        assertTrue(p1.equals(p2));
    }

    @Test
    public void test_equals_equal2() {

        PowerUsage p1 = new PowerUsage();
        PowerUsage p2 = new PowerUsage();
        assertTrue(p1.equals(p2));
    }

    @Test
    public void test_equals_notequal() {

        PowerUsage p1 = new PowerUsage();
        PowerUsage p2 = new PowerUsage("Toaster",800);
        assertFalse(p1.equals(p2));
    }


} // class PowerUsageTest.java
