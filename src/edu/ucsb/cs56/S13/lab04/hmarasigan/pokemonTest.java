package edu.ucsb.cs56.S13.lab04.hmarasigan;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** test class for pokemon
@author Hans Marasigan
@version cs56 S13, lab04
@see pokemon
*/
 
public class pokemonTest{
    @Test 
    public void test_defaultContuctor_and_getters(){
	pokemon p=new pokemon();
	assertEquals("pikachu",p.getPokemonName());
	assertEquals(5,p.getPokemonLevel());
    }
    
    @Test
    public void test_TwoArgConstructor_Squirtle5(){
	pokemon p=new pokemon("squirtle",4);
	assertEquals("squirtle",p.getPokemonName());
	assertEquals(4,p.getPokemonLevel());
    }
    @Test
    public void test_toString_pikachu5(){
	pokemon p = new pokemon();
	assertEquals("pikachu,5",p.toString());
    }
    @Test 
    public void test_toString_pidgey3(){
	pokemon p = new pokemon("pidgey",3);
	assertEquals("pidgey,3",p.toString());
    }
    @Test
    public void test_equals_equal1(){
	pokemon p=new pokemon("p",3);
	pokemon q=new pokemon("p",3);
	assertTrue(p.equals(q));
    }

    @Test
    public void test_equals_equal2(){
	pokemon p=new pokemon();
	pokemon q=new pokemon();
	assertTrue(p.equals(q));
    }
    @Test
    public void test_equals_notequal(){
	pokemon p = new pokemon();
	pokemon q = new pokemon("q",3);
	assertFalse(p.equals(q));
    }
}
