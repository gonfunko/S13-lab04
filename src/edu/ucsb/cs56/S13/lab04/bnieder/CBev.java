package edu.ucsb.cs56.S13.lab04.bnieder;

/**
 <p>
 CBev represents a Caffeinated Beverage.   This class appeared on the midterm for S12.
 The author of this code is Phill Conrad, but it is being added to the repository under the
 account of bnieder as an example of what a student submission might look like as it goes
 through the pull request process (Thanks bnieder for helping us test that.)
 </p>

 <p> A CBev object represents a Caffeinated Beverage, and stores the following 
information about the beverage:
   <ul>
   <li>the name of the beverage (e.g. "Diet Coke" or "Vanilla Latte")</li>
   <li>mpo, a value that represents the caffeine content of the beverage in mg p
er ounce,  (e.g. 2.9, or 9.375) </li>
   </ul>
</p>

 @author P. Conrad
 @see <a href="http://www.cs.ucsb.edu/~pconrad/cs56/11S/exams/E01/actualExam/">http://www.cs.ucsb.edu/~pconrad/cs56/11S/exams/E01/actualExam/</a>
 @see <a href="http://www.cs.ucsb.edu/~pconrad/cs56/11S/exams/E01/code/RadioStation.java">http://www.cs.ucsb.edu/~pconrad/cs56/11S/exams/E01/code/RadioStation.java</a>

*/

public class CBev {

    private String name;
    private double mpo;


    /** 
	@param name name of beverage (e.g. "Latte", "Chai", "Diet Coke")
	@param mpo a value that represents the caffeine content of the beverage in mg per ounce,  (e.g. 2.9, or 9.375)
     */

    public CBev (String name, double mpo) {
	this.name = name;
	this.mpo = mpo;
    }

    /**
       @return name of beverage (e.g. "Diet Coke")       
    */


    public String getName() { return this.name; }

    /**
       @return mpo (mg per oz of caffeine)
     */
    
    public double getMpo() { return this.mpo; }
    
    /**
       Convert to a string representation.  Examples of the string
       value that should be returned: <code>&quot;Diet Coke (2.9
       mg/oz)&quot;</code> o r <code>&quot;Vanilla Latte (9.4 mg/oz)&quot;

       @return String represntation of beverage.
     */
    public String toString() {
	return name + " (" + String.format("%.1f",this.mpo) + " mg/oz)";
    }

    /**
       Two CBev
       objects should be considered equal if they have the same name,
       and their caffeine levels differ by no more than 0.0001.
       @param o another object to compare 
       @return true if this object is the same beverage as o
     */
    public boolean  equals(Object o) { 

	if (! (o instanceof CBev) ) { return false;}
	CBev cb = (CBev) o;
	return (this.name.equals(cb.name) &&
		(Math.abs(this.mpo - cb.mpo) < 0.0001));



    }
}