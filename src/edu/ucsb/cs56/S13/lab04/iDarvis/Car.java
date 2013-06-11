package edu.ucsb.cs56.S13.lab04.iDarvis;

/** Car class that I have come up with.  This class is able to store the Brand's 
 * of various cars and the year that that car was Manufactured.  For example, 
 * if you had a 1998 Toyota Carolla, what you would store is the car Brand, Toyota, 
 * and the year that it was manufactured, 1998.

@author Daryl Pham
@version CS56, S13, lab04
*/
    public class Car {

    private String CarName = "Toyota"; 
    private int Year= 1998; 

    /** Default Constructor creates a Radio Station KCSB, 99.9 */

    public Car() {} ; 

    /** 
	@param CarName car name (e.g. Toyota, BMW, Dodge, Ford, etc)
	@param Year year  (e.g. 2013, 1998, 2005, etc.)
     */
    public Car(String name, int year) { 
	this.CarName = name;
	this.Year = year;
    }

    /**
       @return Car Name  (e.g. Toyota, BMW, Dodge, Ford)       
    */
    public String getCarName() { 
	return CarName; 
    }
    /**
       @return Manufacture year (e.g. 2013, 1998, 2005)
     */
    public int getYear() { 
	return Year; 
    } 
    /**
       @set Car Name  (e.g. Toyota, BMW, Dodge, Ford)       
    */
    public void setCarName(String name) { 
	this.CarName = name; 
    }
     /**
       @set Manufacture year (e.g. 2013, 1998, 2005)
     */
    public void setYear(int year) { 
	this.Year = year; 
    } 
    
  /*  /**
isFM() that returns a true or false value. It should return true when frequency is less than or equal to 108.0—this indicates an FM station. If isFM() returns false, the station is assumed to be an AM station.
       @return true if this is an FM station (false implies AM)
     
    public boolean isFM() {
	return this.freq <= 108.0;
    }*/

    /**
       Convert to a string representation.  Examples: "[Toyota, Manufactured: 1998]"
       @return String represntation of the car.
     */
    public String toString() {
	return "[" + this.CarName + ", Manufactured: " + this.Year + "]";
}
    /** 
	A sample main that uses the class.
     */
    public static void main(String [] args) { 
	Car Car1 = new Car("Toyota", 2001);
	Car Car2 = new Car();
	System.out.println(Car1);
	Car2.setCarName("Ford");
	Car2.setYear(2012);
	System.out.println(Car2);
    }

    /**
       Are the Cars equal?
       @param o another object to compare 
       @return true if this object is the same car make and year as o
     */
    public boolean  equals(Object o) { 

	double tol = 0.01; 
	if (! (o instanceof Car) )
	    return false;
	Car other = (Car) o;
	return (other.getCarName().equals(this.getCarName()) &
	Math.abs(other.getYear() - this.getYear()) < tol ); 
    }
}
	
