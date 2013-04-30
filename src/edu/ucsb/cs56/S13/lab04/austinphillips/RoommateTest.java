package edu.ucsb.cs56.S13.lab04.austinphillips;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RoommateTest {


    /**
       tests get method for the name attribute
       @see Roommate#getName
    */
    @Test
    public void test_getName() {
	Roommate Martin = new Roommate("stub", 42);
	assertEquals("Martin B", Martin.getName());

    }


    /**
       tests the get method for levelOfAnnoyance
       @see Roommate#getLevelofAnnoyance
    */
    @Test
    public void test_getLevelOfAnnoyance(){
	Roommate Martin = new Roommate("stub", 42);
	assertEquals(10000,Martin.getLevelOfAnnoyance());
    }


    /**
       tests the setName function, used with the no arg constructor
       @see Roommate#setName
    */
    public void test_setName(){
	Roommate Martin = new Roommate();
	Martin.setName("stub");
	assertEquals("Martin B", Martin.getName());
    }



    /**
       tests the setLevelOfAnnoyance function, used with the no arg constructor
       @see Roommate#setLevelOfAnnoyance
    */
    public void test_setLevelOfAnnoyance(){
	Roommate Martin = new Roommate();
	Martin.setLevelOfAnnoyance(42);
	assertEquals(10000,Martin.getLevelOfAnnoyance());
    }
    /**
       tests toString's ability to make one large string with the two attributes
       @see Roommate#toString
    */
    @Test
    public void test_ToString() {
	Roommate Martin = new Roommate("stub", 42);
	String expected = "My roommate is Martin B and my current level of annoyance with him is 10000";
	assertEquals(expected, Martin.toString());
    }
    


    /**
       test equals method, should return true if both roommates are the same
       @see Roommate#equals
    */
    @Test
    public void test_Equals() {
	Roommate Martin = new Roommate("stub", 10000);
	Roommate Martin2= new Roommate("stub2", 10000);
	assertEquals(true, Martin.equals(Martin2));
    }
    public void test_Equals_NotEqual() {

	Roommate Martin = new Roommate();
	Roommate Martin2 = new Roommate();
	assertEquals(false, Martin.equals(Martin2));
    }

    

    /**
       tests smack method, should reduce levelofAnnoyance to zero upon use
       @see Roommate#smack
    */
    @Test
    public void test_Smack() {
	Roommate Martin = new Roommate("stub", 42);
	Martin.smack();
	assertEquals(0, Martin.getLevelOfAnnoyance());
    }


}
