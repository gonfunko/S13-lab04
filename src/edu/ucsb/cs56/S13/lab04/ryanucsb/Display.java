package edu.ucsb.cs56.S13.lab04.ryanucsb;

public class Display {
    private String type;
    private int resolution;
    
    /**
       The two arg constructor
       @param type the type of the display (i.e. "LCD")
       @param resolution the number of pixels of the display
     */
    public Display(String type, int resolution) {
	// stub
    }
    /**
       The no-arg constructor. Default values are "LCD" and 2073600
     */
    public Display() {
	// stub
    }
    
    /**
       Returns the display's type
       @return display type
     */
    public String getType() {
	return "stub";
    }
    /**
       Returns the display's resolution
       @return display resolution
     */
    public int getResolution() {
	// stub
	return -1;
    }
    /**
       Set the display's type
       @param display type to set
     */
    public void setType(String type) {
	// stub
    }
    /**
       Set the display's resolution
       @param resolution to set
     */
    public void setResolution(int resolution) {
	// stub
    }

    /**
       Get a string representation of the display (i.e. "LCD, 2073600 pixels"
    */
    public String toString() {
	// stub
	return "stub";
    }
    public boolean equals() {
	// stub
	return false;
    }

    public static void main(String [] args) {
	Display display = new Display("LCD", 100);
	System.out.println(display.toString());
    }
}
