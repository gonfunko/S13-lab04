package edu.ucsb.cs56.S13.lab04.twodimension;





public class Dog{

    private String dogName = "Freddy";
    private String dogSize = "small";
    private int dogAge = 5;
    /** default constructor creates a dog object name freddy, size small, 5 years old*/

    public Dog() {};


    /**
       @para dogName call dog's name, (e.g. Freddy, Eric)
       @para dogSize size of dog,(e.g. big, small, meidum)
       @para dogAge age of dog, (e.g. 5,10,15,20)
    */

    public Dog(String dogName,String dogSize,int dogAge){
	this.dogName = dogName;
	this.dogSize = dogSize;
	this.dogAge = dogAge;
    }

    /** 
	@return dogname
    */
    public String getDogName(){
	return dogName;
    }
    /**
       @return dogsize
    */
    public String getDogSize() { 
	return dogSize; 
    } 
    
    /**
       @return dog age
    */
    public int getDogAge() { 
	return dogAge; 
    } 
    

 /** 
	@set dogname
    */
    public void setDogName(String dogName){
	this.dogName = dogName;
    }
    /**
       @set dogsize
    */
    public void setDogSize(String dogSize) { 
	this.dogSize = dogSize; 
    } 
    
    /**
       @set dog age
    */
    public void getDogAge(int dogAge) { 
	this.dogAge = dogAge; 
    } 
    




    /**
       Convert to a string representation.  Examples: "freddy is a small dog, he's age is 5"
       @return String represntation of dog
    */

    public String toString(){
	return this.dogName + " is a "+this.dogSize+" dog, he's age is "+this.dogAge;
    }


/**
       Are the dogs equal?
       @param o another object to compare 
       @return true if this object is the same radio station as o
     */
    public boolean  equals(Object o) { 	 
	if (! (o instanceof Dog) )
	    return false;
	Dog other = (Dog) o;
	return (other.getDogName().equals(this.getDogName()) &other.getDogSize().equals(this.getDogSize())& other.getDogAge() == this.getDogAge()); 
    }														   

    /**
       a sample main that uses the class.
    */
    public static void main(String [] agrs){

	Dog Freddy  =new Dog("Freddy","small",5);
	System.out.println(Freddy);
    }

}
