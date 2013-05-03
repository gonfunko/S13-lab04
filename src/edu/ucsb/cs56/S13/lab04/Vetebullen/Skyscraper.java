package edu.ucsb.cs56.S13.lab04.Vetebullen;

public class Skyscraper{
	private int noOfStories;
	private String name;
	public Skyscraper(){

		this.noOfStories = 0;
		this.name = "";
	}
	public Skyscraper(int noOfStories,String name){
		this.noOfStories = noOfStories;
		this.name = name;
	}
	public String getName(){return this.name;}
	public int getNoOfStories(){return this.noOfStories;}
	public void setName(String name){
		this.name = name;
	}
	public void setNoOfStories(int noOfStories){
		this.noOfStories = noOfStories;
	}
	public String toString(){return this.name+" has "+this.noOfStories+" stories";}
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
