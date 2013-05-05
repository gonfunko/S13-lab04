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
        this.name = "Unit";
    }
    
    /**
     * Two-arg Constructor for objects of class StarcraftUnit
     * @param name name of unit
     * @param attackDamage damage per attack
     */
    public StarcraftUnit(String name, int attackDamage) {
        this.name = name;
        this.attackDamage = attackDamage;
    }
    
    /**
     * set the name
     * @param  name the new name
     */
    public void setName(String name) {
        this.name = name;
    }
      
  
    /**
     * set the attackDamage 
     * @param  attackDamage the new attackDamage
     */
    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    
    /**
     * get the name
     * @return name
     */
    public String getName() {
        return this.name;
    }
    
    
    /**
     * get the attackDamage
     * @return attackDamage
     */
    
    public int getAttackDamage() {
        return this.attackDamage;
    }

    
    /** format StarcraftUnit number as String, in an expression like:
     *  [Ultralisk, 35]
     *  @return formatted starcraft unit (e.g. [Ultralisk, 35])
     */
    public String toString() {
        return "[" + this.name + ", " + this.attackDamage + "]";
    }
    
    /**
     Check if the units are equal
     @param o another object
     @return true if this object is equal to o
     */
    public boolean equals(Object o) {
        if(!(o instanceof StarcraftUnit)) return false;
        StarcraftUnit other = (StarcraftUnit) o;
        return (this.name.equals(other.getName()) && this.attackDamage == other.getAttackDamage());
    }
    
    /**
     A sample main that uses the class.
     */
    public static void main(String [] args) {
        StarcraftUnit ultra = new StarcraftUnit("Ultralisk",35);
        StarcraftUnit hydra = new StarcraftUnit();
        System.out.println(ultra);
    }
                
}
