package edu.ucsb.cs56.S13.lab04.Alex2578;


/** CS56Grades is a class to represent grades on assignments in CS56
 @author @@@ Alex Molina
 @version 05/1/2013 for lab04, cs56, S13
*/

public class CS56Grades {

    private String assign; // Name of assignment
    private int grade; // Grade of assignment: 100 = A+, 75 = C

    /** Constructor 
	@param assign Name of Assignment
	@param grade Grade of Assignment
    */

    public CS56Grades (String a, int g)
    {
	// assign attributes from parameters
	this.assign = a; 
	this.grade = g;}
    /**
       Default Cosntructor "NULL", 0
    */

    public CS56Grades(){
	this.assign = "NULL";
	this.grade = 0;}
    /**
       @return assignment name("HW01", "HW07")
     */
    
    public String getAssign () { return this.assign; } 

    /**
       @return grade of assignment(78,84,88)
     */
    public int getGrade () { return this.grade; }

    /**
       Set Assignment
     */
    
    public void setAssign (String a){
	this.assign = a;}

    /**
       Set Grade
     */
    public void setGrade (int a) {
	this.grade = a;}

    /**
       @return String represntation of assignment and grade
     */
    public String toString () {
	return (this.assign + " grade is " + this.grade);}

    /**
       A sample main that uses the class
     */
    public static void main (String [] args) {
	CS56Grades hw = new CS56Grades();
	hw.setAssign("HW01");
	hw.setGrade(92);
	System.out.println(hw.toString());}
    /**
     Are the assignments equal?
     @param x another object to compare
     @return true if this object is the same assignment as x
    */
    public boolean equals(CS56Grades x){
	if(this.assign == x.assign && this.grade == x.grade){
	    return true;}
	else
	    return false;
    }


}
