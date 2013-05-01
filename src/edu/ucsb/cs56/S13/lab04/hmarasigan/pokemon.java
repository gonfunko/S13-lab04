
/*
  pokemon represents a pokemon ( you can make this pokemon up or use a pokemon that has already been created.) The pokemon level can be as low as 1 and high as 100. 
 */
public class pokemon(){
    private String name; // pokemon name(pikachu, squirtle, charmander etc)
    private int level; // pokemon level (1-100)
    
    /** Default Constructor 
     *  creates pikachu level 5
     */
    public pokemon(){
	String name="pikachu";
	int level = 5;
    }
    /** constructor
     @param name of pokemon(ie pikachu charmander etc.)
     @param level of pokemon(1-100)
    */

    public pokemon(String name, int level){
	this.name=name;
	this.level=level;
    }
    
    /**
       get pokemon name
    */
    public String getPokemonName()
    {
	return "stub";
    }
    /**
       get pokemon level
    */
    public int getPokeomonLevel()
    {
	return -42;//     @@@ stub
    }
    /**
     *set pokemon name
     *@param pokemon name
    */
    public void setPokemonName(String name)
    {
	return "stub";
    }
    /**
     *set pokemon level
     * @ param level
    */
    public void setPokemonLevel(int level)
    {
	return "stub";
    }
    
	    
 
