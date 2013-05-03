package edu.ucsb.cs56.S13.lab04.Alex2578;


/** CS56Grades is a class to represent grades on assignment in CS56
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

    public CS56Grades(){
	this.assign = "NULL";
	this.grade = 0;}
    /**
       Get Assingment Name
     */
    
    public String getAssign () { return ""; } 

    /**
       Get Grade
     */
    public int getGrade () { return -42; }

    /**
       Set Assingment Name
     */
    
    public void setAssign (String a){
	}

    /**
       Set Grade
     */
    public void setGrade (int a) {
	}

    /**
       Get Grade
     */
    public String toString () {
	return ("");}


    public boolean equals(CS56Grades x){
           return true;}



}
