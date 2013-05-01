package edu.ucsb.cs56.S13.lab04.BrandonNewman;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;



public class StreetAddressTest
{
	public static final double TOL = 0.00001;

	@Test public void testNoArgConstructor()
	{
		StreetAddress s = new StreetAddress();
		assertEquals(null, s.getStreetName());
		assertEquals(0, s.getStreetNumber());
	}

	@Test public void testTwoArgConstroctor()
	{
		StreetAddress s = new StreetAddress("Pardall", 192);
		assertEquals("Pardall", s.getStreetName());
		assertEquals(192, s.getStreetNumber());
	}

	@Test public void testSetStreetName()
	{
		StreetAddress s = new StreetAddress();
		s.setStreetName("Alana Lane");
		assertEquals("Alana Lane", s.getStreetName());
	}

	@Test public void testSetStreetNumber()
	{
		StreetAddress s = new StreetAddress();
		s.setStreetNumber(544);
		assertEquals(544, s.getStreetNumber());
	}

	@Test public void testGetStreetName()
	{
		StreetAddress s = new StreetAddress("Camino Del Sur", 785);
		assertEquals("Camino Del Sur", s.getStreetName());
	}

	@Test public void testGetStreetNumber()
	{
		StreetAddress s = new StreetAddress("Camino Del Sur", 785);
		assertEquals("Camino Del Sur", s.getStreetNumber());
	}

	@Test public void testToString()
	{
		StreetAddress s = new StreetAddress("Lone Oak Drive", 2413);
		assertEquals("2413 Lone Oak Drive", s.toString());
	}

	@Test public void testEquals()
	{
		StreetAddress s = new StreetAddress("Lone Oak Drive", 2413);
		StreetAddress s2 = new StreetAddress("Lone Oak Drive", 2413);
		assertEquals(true, s.equals(s2));
	}






}
