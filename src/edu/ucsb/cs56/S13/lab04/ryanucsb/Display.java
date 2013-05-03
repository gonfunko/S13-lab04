package edu.ucsb.cs56.S13.lab04.ryanucsb;

/**
   Class representing a display.
   @author Ryan Halbrook
   @version CS56, S13, Lab04
 */

public class Display {

    private String type;
    private int resolution;
    
    /**
       The two arg constructor
       @param type the type of the display (i.e. "LCD")
       @param resolution the number of pixels of the display
     */
    public Display(String type, int resolution) {
	this.type = type;
	this.resolution = resolution;
    }

    /**
       The no-arg constructor. Default values are "LCD" and 2073600
     */
    public Display() {
	this.type = "LCD";
	this.resolution = 2073600;
    }
    
    /**
       Returns the display's type
       @return display type
     */
    public String getType() {
	return this.type;
    }

    /**
       Returns the display's resolution
       @return display resolution
     */
    public int getResolution() {
	return this.resolution;
    }

    /**
       Set the display's type
       @param display type to set
     */
    public void setType(String type) {
	this.type = type;
    }

    /**
       Set the display's resolution
       @param resolution to set
     */
    public void setResolution(int resolution) {
	this.resolution = resolution;
    }

    /**
       Get a string representation of the display (i.e. "LCD, 2073600 pixels"
    */
    public String toString() {
	return (this.type + ", " + this.resolution + " pixels");
    }

    public boolean equals(Object o) {
	if (!(o instanceof Display)) {
	    return false;
	}
	Display d = (Display)o;
	return (resolution == d.getResolution() && type.equals(d.type));
    }

    public static void main(String [] args) {
	Display display = new Display("LCD", 100);
	System.out.println(display.toString());
    }
}
