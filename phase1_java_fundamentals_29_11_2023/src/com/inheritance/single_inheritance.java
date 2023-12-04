package com.inheritance;  //single inheritance

class vehicle{               // super class or base class
	
	public String name;
	public String brand;
	public String model;
	public int year;
	
	public vehicle(String name, String brand, String model, int year) {      //constructor
		super();
		this.name=name;
		this.brand=brand;
		this.model=model;
		this.year=year;
	}
	
	public void display() {             //method to display the vehicle information
		 System.out.println("This" + " " + this.brand+ " " +  "is a" + " "+ this.year+ " " + "model named"+ " "+  this.model);
	}
}

class car extends vehicle{
	
	public int numOfWheels;
	public int numOfDoor;
	
	//constructor
	public car(int numOfWheels,int numOfDoor, String name, String brand, String model, int year) {
		 super(name, brand, model, year);  // initialize parent class constructor
		 this.numOfDoor = numOfDoor;
		 this.numOfWheels = numOfWheels;
	}
	
	public void define() {
		
		 System.out.println("The" + " " +this.brand+" " +  "is a " +" "+ this.name  +" "+ this.model+" "+ "of" +" "+
		 this.year+" "+ "which has"+" "+ this.numOfDoor+" "+ "and" + " "+ this.numOfWheels );
	}
	
	
}
public class single_inheritance {
	
	public static void main(String[] args) {
		
		//creating the objects to the class
		
		car porsche=new car(4, 4, "Porsche Cayman" , "Porsche", "718 Cayman GT4 RS", 2022);
		
		porsche.display();
		porsche.define();
	}

}
