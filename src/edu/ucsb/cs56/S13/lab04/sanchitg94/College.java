package edu.ucsb.cs56.S13.lab04.sanchitg94;

/**

 College represents a College. A College has a name, such as "UCSB" in short, and some number of students, like 21,000.

*/

public class College {

    private String name = "UCSB"; 
    private int num = 21000; 

    /** Default Constructor creates a College UCSB, 21000 */

    public College() {} ; 

    /** 
	@param name (e.g. UCSB, UCLA, SLO)
	@param num  (e.g. 21000, 15000, 25000)
     */
    public College(String name, int num) { 
	this.name = name;
	this.num = num;
    }

    /**
       @return name (e.g. UCSB, UCLA, SLO)      
    */
    public String getName() { 
		return name; 
    }
    /**
       @return num  (e.g. 21000, 15000, 25000)
     */
    public int getNum() { 
		return num; 
    }

 	/**
	 * Set the name
	 *
	 * @param n the new name
	 */
	public void setName(String n)
	{
		name = n;
	}
	
	/**
	 * Set the num
	 *
	 * @param number the new num
	 */
	public void setNum(int number)
	{
		num = number;
	}
	
	

    /**
       Convert to a string representation.  Examples: "UCSB, 21000 Students", "SLO, 15000 Students"
       @return String represntation of a college.
     */
    public String toString() {
		return this.name + ", " + this.num + " Students";
    }

    /** 
	A sample main that uses the class.
     */
    public static void main(String [] args) { 
		College UCSB = new College ("UCSB", 21000);
		College SLO = new College ();
		System.out.println(SLO);
    }

    /**
       Are the colleges equal?
       @param o another object to compare 
       @return true if this object is the same radio station as o
     */
    public boolean  equals(Object o) { 
		if (! (o instanceof College) )
	    	return false;
		College other = (College) o;
		return (other.getName().equals(this.getName()) & other.getNum() == this.getNum());
    }
}