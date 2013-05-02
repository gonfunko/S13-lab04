package edu.ucsb.cs56.S13.lab04.ryanucsb;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class DisplayTest {

    @Test
    public void test_defaultConstructorAndGetters() {
	Display defaultDisplay = new Display();
	assertEquals("LCD", defaultDisplay.getType());
	assertEquals(2073600, defaultDisplay.getResolution());
    }

    @Test
    public void test_twoArgConstructorAndGetters() {
	Display display = new Display("Dot-matrix", 2048);
	assertEquals("Dot-matrix", display.getType());
	assertEquals(2048, display.getResolution());
    }
    
    @Test
    public void test_setterAndGetter_type() {
	Display display = new Display();
	display.setType("CRT");
	assertEquals("CRT", display.getType());
    }

    @Test
    public void test_setterAndGetter_resolution() {
	Display display = new Display();
	display.setResolution(921600);
	assertEquals(921600, display.getResolution());
    }

    @Test
    public void test_toString() {
	Display display = new Display("LCD", 2073600);
	assertEquals("LCD, 2073600 pixels", display.toString());
    }

    @Test
    public void test_equals1() {
	Display display1 = new Display();
	Display display2 = new Display("LCD", 2073600);
	assertTrue(display1.equals(display2));
    }

    @Test
    public void test_equals2() {
	Display display1 = new Display();
	Display display2 = new Display();
	assertTrue(display1.equals(display2));
    }

    @Test
    public void assert_equalsFalse() {
	Display display1 = new Display();
	Display display2 = new Display();
	display2.setResolution(100);
	assertFalse(display1.equals(display2));
    }



}
