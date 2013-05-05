package edu.ucsb.cs56.S13.lab04.Vetebullen;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
Test class for Skyscraper
@author Gunnar Weibull
@version 1.0
@see Skyscraper
*/
public class SkyscraperTest{
	@Test public void testNoArgConstructor(){
		Skyscraper s = new Skyscraper();
		assertEquals("",s.getName());
		assertEquals(0,s.getNoOfStories());
	}
	@Test public void testArgConstructor(){
		Skyscraper s = new Skyscraper(2,"My house");
		assertEquals("My house",s.getName());
		assertEquals(2,s.getNoOfStories());
	}
	@Test public void testGetName(){
		Skyscraper s = new Skyscraper(2,"My house");
		assertEquals("My house",s.getName());
	}
	@Test public void testGetNoOfStories(){
		Skyscraper s = new Skyscraper(2,"My house");
		assertEquals(2,s.getNoOfStories());
	}
	@Test public void testSetName(){
		Skyscraper s = new Skyscraper();
		s.setName("My house");
		assertEquals("My house",s.getName());
	}
	@Test public void testSetNoOfStories(){
		Skyscraper s = new Skyscraper();
		s.setNoOfStories(2);
		assertEquals(2,s.getNoOfStories());
	}
	@Test public void testToString(){
		Skyscraper s = new Skyscraper(2,"My house");
		assertEquals("My house has 2 stories",s.toString());
	}
	@Test public void testEquals(){
		Skyscraper s1 = new Skyscraper(2,"My house");
		Skyscraper s2 = new Skyscraper(2,"My house");
		Skyscraper s3 = new Skyscraper();
		assertEquals(true,s1.equals(s2));
		assertEquals(false,s1.equals(new Object()));
		assertEquals(false,s1.equals(s3));
		s3.setName("My house");
		s3.setNoOfStories(2);
		assertEquals(true,s1.equals(s3));
		s3.setName("Not my house anymore");
		assertEquals(false,s1.equals(s3));
	}

	
}