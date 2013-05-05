package edu.ucsb.cs56.S13.lab04.Vetebullen;
/**

Skyscraper represents a Skyscraper, with information about the number of stories (floors) and the name of the building.
Possible uses include a checklist for the skyscraper-connoisseur or a Godzilla-game. 
*/
public class Skyscraper{
	
	
	private int noOfStories;
	private String name;
	
	/** Default constructor creates an unnamed skyscraper with 0 stories*/
	public Skyscraper(){

		this.noOfStories = 0;
		this.name = "";
	}
	
	/**
	@param noOfStories Number of stories of the skyscraper (eg. 50, 100, 354)
	@param name Name of the skyscraper (e.g. Empire State Building, Storke Tower)
	*/
	public Skyscraper(int noOfStories,String name){
		this.noOfStories = noOfStories;
		this.name = name;
	}
	
	/**
		@return Name (e.g. Empire State Building, Storke Tower)
	*/
	public String getName(){return this.name;}
	
	/** 
		@return No of Stories (eg. 50, 100, 354)
	*/
	public int getNoOfStories(){return this.noOfStories;}
	/**
		@param name (e.g. Empire State Building, Storke Tower)
		*/
	public void setName(String name){
		this.name = name;
	}
	/**
		@param noOfStories Number of stories of the skyscraper (eg. 50, 100, 354)
		*/
	public void setNoOfStories(int noOfStories){
		this.noOfStories = noOfStories;
	}
	/**
		@return String representation of skyscraper (e.g. "Empire State Building has 102 stories")
		*/
	public String toString(){return this.name+" has "+this.noOfStories+" stories";}
	/**
		Checks if the input object is equal to this skyscraper (tests match for name and number of stories)
		@param o Object to test for equality
		@return true if the input object is equal to this skyscraper, false otherwise.
		*/
	public boolean equals(Object o){
		if(o==null){
			return false;
		}
		if(!(o instanceof Skyscraper)){
			return false;
		}
		Skyscraper s = (Skyscraper) o;

		if(this.getName().equals(s.getName())&&
		this.getNoOfStories()==s.getNoOfStories()){
			return true;	
		}
		return false;
	}
	
	public static void main(String[] args){
		Skyscraper s = new Skyscraper(102,"Empire State Building");
		s.toString();
	}
}
