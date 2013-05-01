package edu.ucsb.cs56.S13.lab04.bkhanijau;

/**

ProteinPowder class represents a brand of protein powder. 
Each different brand contains it's own name and each brand
has a different concentration of protein. The brand is
represented in a String and the amount of grams per serving
of each brand is represented in an int.
*/

public class ProteinPowder {

    private String brand; 
    private int gramsProtein; 

    /** 
    Default Constructor creates a protein powder object of value Default,0 
    */

    public ProteinPowder() {
        brand = "STUB";
        gramsProtein = -42; //STUB
    } 

    /** 
	@param brand
	@param gramsProtein
     */
    public ProteinPowder(String brand, int grams) { 
        brand = "STUB";
        gramsProtein = -42; //STUB
    }

    /**
       @return brand      
    */
    public String getBrand() { 
	return "STUB"; 
    }
    /**
       @return grams of protein per serving
     */
    public int getGramsProtein() { 
	return -42; //STUB
    } 
    
    /**
checks if it is a possible object. Must have no less than 0 grams of protein per serving
     */
    public boolean isPossibleProtein() {
        return false; //STUB
    }

     /**
       Check if powders are equal
       @param o another object to compare 
       @return true if this object is the same powder as o
     */
    public boolean  equals(Object o) { 
    return false; //STUB
    }

    /**
       Convert to a string representation.  Examples: "Isopure, 25", "Gold Standard, 24"
       @return String represntation of protein powder.
     */
    public String toString() {
	return "STUB";
    }

    /** 
	Sample main
     */
    public static void main(String [] args) { 
	ProteinPowder goldStandard = new ProteinPowder("Gold Standard",24);
	ProteinPowder none = new ProteinPowder();
	System.out.println(goldStandard);
    }

}