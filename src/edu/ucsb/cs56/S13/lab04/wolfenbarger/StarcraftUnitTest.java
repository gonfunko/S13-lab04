package edu.ucsb.cs56.S13.lab04.wolfenbarger;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * A Test class for StarcraftUnit - a starcraft unit with naem and attack damage
 * 
 * @author Martin Wolfenbarger
 * @version 2013/05/01 for lab04, cs56, s13
 * @see StarcraftUnit
 */

public class StarcraftUnitTest {
    // define a static final (a constant) for error tolerance
    // we'll pass this as the last value of every assertEquals()
    // call that is done on double values to allow for roundoff error
    
    @Test public void testNoArgConstructor() {
        // the no arg constructor should give us "Unit" for name
        // and 0 for attackDamage
        StarcraftUnit s = new StarcraftUnit();
        assertEquals("Unit",s.getName());
        assertEquals(0,s.getAttackDamage());
	
    }
    
    @Test public void testTwoArgConstructor() {
        StarcraftUnit s = new StarcraftUnit("Ultralisk", 35);
        assertEquals( "Ultralisk", s.getName());
        assertEquals( 35, s.getAttackDamage());
    }
    
    @Test public void testSetAndGetName() {
        StarcraftUnit s = new StarcraftUnit();
        s.setName("Ultra");
        assertEquals( "Ultra", s.getName());
    }
    
    @Test public void testSetAndGetAttackDamage() {
        StarcraftUnit s = new StarcraftUnit();
        s.setAttackDamage(35);
        assertEquals( 35, s.getAttackDamage());
    }
    
    
    @Test public void testToString1() {
        StarcraftUnit s = new StarcraftUnit("Mutalisk",9);
        assertEquals("[Mutalisk, 9]",s.toString());
    }
    
    @Test public void testToString2() {
        StarcraftUnit s = new StarcraftUnit("Marine", 6);
        assertEquals("[Marine, 6]",s.toString());
    }
    
    @Test public void test_equals_equal1() {
        StarcraftUnit s1 = new StarcraftUnit("Zergling",5);
        StarcraftUnit s2 = new StarcraftUnit("Zergling",5);
        assertTrue(s1.equals(s2));
    }
    
    @Test public void test_equals_equal2() {
        StarcraftUnit s1 = new StarcraftUnit();
        StarcraftUnit s2 = new StarcraftUnit();
        assertTrue(s1.equals(s2));
    }
    
    @Test public void test_equals_notequal() {
        StarcraftUnit s1 = new StarcraftUnit();
        StarcraftUnit s2 = new StarcraftUnit("Hydralisk",12);
        assertFalse(s1.equals(s2));
    }
}
