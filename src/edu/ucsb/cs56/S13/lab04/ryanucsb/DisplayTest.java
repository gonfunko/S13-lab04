package edu.ucsb.cs56.S13.lab04.ryanucsb;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
   Unit tests for the Display class
   @author Ryan Halbrook
   @version CS56, S13, Lab04
   @see Display
 */

public class DisplayTest {

    /**
       Tests the no-arg constructor, uses getters
       to check values.
       @see Display
    */
    @Test
    public void test_defaultConstructorAndGetters() {
	Display defaultDisplay = new Display();
	assertEquals("LCD", defaultDisplay.getType());
	assertEquals(2073600, defaultDisplay.getResolution());
    }

    /**
       Tests the two arg constructor, uses getters
       to check values.
       @see Display
     */
    @Test
    public void test_twoArgConstructorAndGetters() {
	Display display = new Display("Dot-matrix", 2048);
	assertEquals("Dot-matrix", display.getType());
	assertEquals(2048, display.getResolution());
    }
    
    /**
       Tests the setter for the display type.
       @see Display
     */
    @Test
    public void test_setter_type() {
	Display display = new Display();
	display.setType("CRT");
	assertEquals("CRT", display.getType());
    }

    /**
       Tests the setter for the resolution.
       @see Display
     */
    @Test
    public void test_setter_resolution() {
	Display display = new Display();
	display.setResolution(921600);
	assertEquals(921600, display.getResolution());
    }

    /**
       Tests the getter for the display type.
       @see Display
     */
    @Test
    public void test_getter_type() {
	Display display = new Display("LCD", 100);
	assertEquals("LCD", display.getType());
    }

    /**
       Tests the getter for the resolution.
       @see Display
     */
    @Test
    public void test_getter_resolution() {
	Display display = new Display("LCD", 921600);
	assertEquals(921600, display.getResolution());
    }

    /**
       Test the toString method.
       @see Display
     */
    @Test
    public void test_toString() {
	Display display = new Display("LCD", 2073600);
	assertEquals("LCD, 2073600 pixels", display.toString());
    }

    /**
       Test the equals method when using both
       types of constructors.
       @see Display
     */
    @Test
    public void test_equals1() {
	Display display1 = new Display();
	Display display2 = new Display("LCD", 2073600);
	assertTrue(display1.equals(display2));
    }

    /**
       Test the equals method when using
       the default constructor.
       @see Display
    */
    @Test
    public void test_equals2() {
	Display display1 = new Display();
	Display display2 = new Display();
	assertTrue(display1.equals(display2));
    }

    /**
       Test the equals method when the objects are not equal.
       Either this test or the tests above will fail on a stub
       because there are only two return possibilities with type
       boolean.
       @see Display
     */
    @Test
    public void test_equalsFalse() {
	Display display1 = new Display();
	Display display2 = new Display();
	display2.setResolution(100);
	assertFalse(display1.equals(display2));
    }

}
