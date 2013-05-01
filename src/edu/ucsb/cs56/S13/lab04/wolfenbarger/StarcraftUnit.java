package edu.ucsb.cs56.S13.lab04.wolfenbarger;
/**
 * A Starcraft Unit with given name and attack damage
 * @author Martin Wolfenbarger
 * @version 2013/05/01 for lab04, cs56, s13
 */
public class StarcraftUnit
{
   private String name;
   private int attackDamage;

    /**
     * noarg Constructor for objects of class StarcraftUnit
     */
    
    public StarcraftUnit() {
        this.name = "stub";
    }
    
    /**
     * Two-arg Constructor for objects of class StarcraftUnit
     * @param name name of unit
     * @param attackDamage damage per attack
     */
    public StarcraftUnit(String name, int attackDamage) {
        this.name = "stub";
        this.attackDamage = 0;
    }
    
    /**
     * set the name
     * @param  name the new name
     */
    public void setName(String name) {
        this.name = "stub";
    }
      
  
    /**
     * set the attackDamage 
     * @param  attackDamage the new attackDamage
     */
    public void setAttackDamage(int attackDamage) {
        this.attackDamage = 0;
    }

    
    /**
     * get the name
     * @return name
     */
    public String getName() {
        return "stub";
    }
    
    
    /**
     * get the attackDamage
     * @return attackDamage
     */
    
    public int getAttackDamage() {
        return 0;
    }

    
    /** format StarcraftUnit number as String, in an expression like:
     *  Ultralisk 35
     *  @return formatted starcraft unit (e.g. Ultralisk 35)
     */
    public String toString() {
        return "stub";
    }
    
    /**
     Check if the units are equal
     @param o another object
     @return true if this object is equal to o
     */
    public boolean equals(Object o) {
        return false;
    }
    
}
