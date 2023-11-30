package com.assisted.practice;

	// understanding the class, contructor and objects
	public class class_constructor_object {  // creating a class
		  int modelYear;
		  String modelName;
		  String modelColor;

		  public class_constructor_object(int year, String name, String color ) {  //constructor
		    modelYear = year;
		    modelName = name;
		    modelColor= color;
		  }

		  public static void main(String[] args) {
			  class_constructor_object myCar = new class_constructor_object(1999, "Porsche", "Blue");  // creating an object 
		    System.out.println(myCar.modelYear + " " + myCar.modelName+ " " +myCar.modelColor);
		  }
		}



