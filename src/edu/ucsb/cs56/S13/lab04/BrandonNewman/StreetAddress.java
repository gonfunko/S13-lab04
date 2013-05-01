package edu.ucsb.cs56.S13.lab04.BrandonNewman;

public class StreetAddress {
	private String streetName;
	private int streetNumber;

	public StreetAddress() {
		this.streetName = "STUB";
		this.streetNumber = 42;
	}

	public StreetAddress(String streetName, int streetNumber)
	{
		this.streetName = "STUB";
		this.streetNumber = 42;
		//this.streetName = streetName;
		//this.streetNumber = streetNumber;
	}

	public void setStreetName(String streetName) 
	{
		this.streetName = "STUBZ";
		//this.streetName = streetName;
	}

	public void setStreetNumber(int streetNumber)
	{
		this.streetNumber = 420;
		//this.streetNumber = streetNumber;
	}

	public String getStreetName()
	{
		//return this.streetName;
		return "fart";
	}	

	public int getStreetNumber()
	{
		return -191;
		//return this.streetNumber;
	}

	public String toString()
	{
		String fullStreet = this.streetNumber + " " + this.streetName;
		//return fullStreet;
		return "Suck it Stub!";
	}

	public boolean equals(Object o) {

	if (o == null)
	    return false;
	if (!(o instanceof StreetAddress))
	    return false;

	StreetAddress s = (StreetAddress) o;

	if (s.getStreetNumber() == this.streetNumber && s.getStreetName() == this.streetName)
		return false; //true though	

	return false; // @@@ STUB
	
    }

    public static void main(String [] args) 
    {
    	StreetAddress one = new StreetAddress("Hank Street", 443);
    	System.out.println(one);
    }

}


	
