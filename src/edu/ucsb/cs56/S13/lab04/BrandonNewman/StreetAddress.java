package edu.ucsb.cs56.S13.lab04.BrandonNewman;

public class StreetAddress {
	private String streetName;
	private int streetNumber;

	public StreetAddress() {
	}

	public StreetAddress(String streetName, int streetNumber)
	{

		this.streetName = streetName;
		this.streetNumber = streetNumber;
	}

	public void setStreetName(String streetName) 
	{
		this.streetName = streetName;
	}

	public void setStreetNumber(int streetNumber)
	{
		this.streetNumber = streetNumber;
	}

	public String getStreetName()
	{
		return this.streetName;
	}	

	public int getStreetNumber()
	{
		return this.streetNumber;
	}

	public String toString()
	{
		String fullStreet = this.streetNumber + " " + this.streetName;
		return fullStreet;
	}

	public boolean equals(Object o) {

	if (o == null)
	    return false;
	if (!(o instanceof StreetAddress))
	    return false;

	StreetAddress s = (StreetAddress) o;

	if (s.getStreetNumber() == this.streetNumber && s.getStreetName() == this.streetName)
		return true; //true though	

	return false; // @@@ STUB
	
    }

    public static void main(String [] args) 
    {
    	StreetAddress one = new StreetAddress("Hank Street", 443);
    	System.out.println(one);
    }

}


	
