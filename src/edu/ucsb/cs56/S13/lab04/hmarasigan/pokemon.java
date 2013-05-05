package edu.ucsb.cs56.S13.lab04.hmarasigan;
/**
  pokemon represents a pokemon ( you can make this pokemon up or use a pokemon that has already been created.) The pokemon level can be any integer. 
 */
public class pokemon{
    private String name; // pokemon name(pikachu, squirtle, charmander etc)
    private int level; // pokemon level(any integer)
    
    /** Default Constructor 
     *  creates pikachu level 5
     */
    public pokemon(){
	
	this.name= "pikachu";
	this.level = 5;
    }
    /** constructor
     *@param name of pokemon(ie pikachu charmander etc.)
     *@param level of pokemon(1-100)
    */

    public pokemon(String name, int level){
	this.name = name;
	this.level = level;
    }
    
    /**
       get pokemon name
    */
    public String getPokemonName()
    {
	return this.name;
    }
    /**
       get pokemon level
    */
    public int getPokemonLevel()
    {
	return this.level;
    }
    /**
     *set pokemon name
     *@param pokemon name
    */
    public void setPokemonName(String name)
    {
	this.name=name;
    }
    /**
     *set pokemon level
     * @ param level
    */
    public void setPokemonLevel(int level)
    {
	this.level=level;
    }
    /**
     * makes the instance into a string
     */
    public String toString()
    {
	return this.name +","+ this.level;
    }
    /**
     *checks if 2 pokemon objects are equal
     */
    public boolean equals(Object o)
    {
	if (!(o instanceof pokemon))
	    return false;
	pokemon pkmn = (pokemon) o;
	if (pkmn.getPokemonName()!=this.getPokemonName())
	    return false;

	if (pkmn.getPokemonLevel()!=this.getPokemonLevel())
	    return false;
	
	return true;
    }
    /**
       A sample main
    */
    public static void main(String [] args){
	pokemon first = new pokemon("charmander",5);
	pokemon second= new pokemon();
	System.out.println(first);
	System.out.println(second);
    }
}
