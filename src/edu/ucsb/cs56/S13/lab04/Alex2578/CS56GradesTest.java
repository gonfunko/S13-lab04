package edu.ucsb.cs56.S13.lab04.Alex2578;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/** Test class for CS56Grades

 * @author Alex Molina
 * @version 2013/05/1 for lab04, cs56, s13
 * @see CS56Grades

*/

public class CS56GradesTest {

    /** Test case for CS56Grades no arg constructor
     @see CS56Grades
    */

    @Test
    public void test_NoArgConstructor(){
        CS56Grades h = new CS56Grades();
        assertEquals("NULL",h.getAssign());
	assertEquals(0,h.getGrade());
    }

    /** Test case for CS56Grades two parameter constructor
     @see CS56Grades
    */

    @Test
    public void test_TwoArgConstructor(){
        CS56Grades h = new CS56Grades("HW01", 92);
        assertEquals("HW01",h.getAssign());
	assertEquals(92,h.getGrade());
    }

    /** Test case for CS56Grades.getAssign()
     @see CS56Grades
    */

    @Test
	public void test_getAssign() {
	CS56Grades h = new CS56Grades("HW01", 92);
	assertEquals("HW01",h.getAssign());
    }

    /** Test case for CS56Grades.getGrade()
     @see CS56Grades
    */
    
    @Test
	public void test_getGrade() {
	CS56Grades h = new CS56Grades("HW01", 92);
	assertEquals(92 ,h.getGrade());
    }

    /** Test case for CS56Grades.setAssign()
     @see CS56Grades
    */

    @Test
    public void test_setAssign() {
        CS56Grades h = new CS56Grades("HW01", 92);
	h.setAssign("HW02");
        assertEquals("HW02",h.getAssign());
    }

    /** Test case for CS56Grades.setGrade()
     @see CS56Grades
    */

    @Test
    public void test_setGrade() {
        CS56Grades h = new CS56Grades("HW01", 92);
	h.setGrade(100);
        assertEquals(100 ,h.getGrade());
    }

    /** Test case for UCSBCourse.toString()
     @see CS56Grades
    */

    @Test
    public void test_toString(){
	CS56Grades h = new CS56Grades("HW02", 75);
	assertEquals("HW02 grade is 75" ,h.toString());
    }

    /** Test case for UCSBCourse.equals()
     @see CS56Grades
    */

    @Test
    public void test_equals(){
        CS56Grades h = new CS56Grades("HW02", 75);
        CS56Grades l = new CS56Grades("HW02", 75);
	assertEquals(true ,h.equals(l));
    }

}
