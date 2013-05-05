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
	
	
	Dog r = new Dog();
	assertEquals("Freddy",r.getDogName());
	assertEquals("small",r.getDogSize());
	assertEquals(5,r.getDogAge());	
    }
    
    @Test
	public void test_TwoArgConstructor_and_getters_Dog() {
	
	
	Dog r = new Dog("Marry","small",3);
	assertEquals("Marry",r.getDogName());
	assertEquals("small",r.getDogSize());
	assertEquals(3,r.getDogAge());	
    }

   
    @Test
	public void test_toString_Dog() {
	
	Dog r = new Dog();
	assertEquals("Freddy is a small dog, he's age is 5",r.toString());
    }

  
    @Test
	public void test_equals_equal1() {
		
	Dog r1 = new Dog("Freddy","small",5);
	Dog r2 = new Dog("Freddy","small",5);
	assertTrue(r1.equals(r2));
    }

    @Test
	public void test_equals_equal2() {
		
	Dog r1 = new Dog();
	Dog r2 = new Dog();
	assertTrue(r1.equals(r2));
    }

    @Test
	public void test_equals_notequal() {
		
	Dog r1 = new Dog();
	Dog r2 = new Dog("Eric","big",10);
	assertFalse(r1.equals(r2));
    }


} // class DogTest.java
