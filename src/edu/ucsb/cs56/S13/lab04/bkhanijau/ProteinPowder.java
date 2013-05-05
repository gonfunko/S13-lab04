package edu.ucsb.cs56.S13.lab04.bkhanijau;



/**

ProteinPowder class represents a brand of protein powder. 
Each different brand contains it's own name and each brand
has a different concentration of protein. The brand is
represented in a String and the amount of grams per serving
of each brand is represented in an int.
*/

/** Class ProteinPowder

@author Bhanu Khanijau
@version CS56, S13, lab04, 5/1/13

*/
public class ProteinPowder {

    private String brand = "Isopure"; 
    private int gramsProtein = 25; 

    /** 
    Default Constructor creates a protein powder object of value Default,0 
    */

    public ProteinPowder() {
    } 

    /** 
	@param brand
	@param gramsProtein
     */
    public ProteinPowder(String brand, int grams) { 
        this.brand = brand;
        this.gramsProtein = grams;
    }

    /**
       @return brand      
    */
    public String getBrand() { 
	return this.brand; 
    }
    /**
       @return grams of protein per serving
     */
    public int getGramsProtein() { 
	return this.gramsProtein;
    } 
    
    /**
checks if it is a possible object. Must have no less than 0 grams of protein per serving
     */
    public boolean isPossibleProtein() {
        return (this.getGramsProtein()>=0);
    }

     /**
       Check if powders are equal
       @param o another object to compare 
       @return true if this object is the same powder as o
     */
    public boolean  equals(Object o) { 
    if (! (o instanceof ProteinPowder) )
        return false;
    ProteinPowder test = (ProteinPowder) o;
    return ( this.getBrand().equals(test.getBrand()) && ( this.getGramsProtein() == test.getGramsProtein()) ); 
    }

    /**
       Convert to a string representation.  Examples: "Isopure, 25", "Gold Standard, 24"
       @return String represntation of protein powder.
     */
    public String toString() {
	return this.getBrand() + ", " + this.getGramsProtein();
    }

    /** 
	Sample main
     */
    public static void main(String [] args) { 
	ProteinPowder goldStandard = new ProteinPowder("Gold Standard",24);
	ProteinPowder iso = new ProteinPowder();
	System.out.println(goldStandard);
    }

}