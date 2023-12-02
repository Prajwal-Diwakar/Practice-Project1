package com.geometry_functionality;

import java.util.ArrayList;

class Shape {      //parent class
	
    public void displayArea()
    {
    	
        System.out.println("Shape");
    }
}

class Rectangle extends Shape{  //child class of shape
	
	private double length;
	private double breadth;
	
	public Rectangle(double length, double breadth) {           // constructor
		this.length=length;
		this.breadth=breadth;
		
	}
	
	@Override
	public void displayArea() {                  //method
        double area = calculateArea();
        System.out.println("Area of Rectangle: " + area);
    }

    public double calculateArea() {
        return length * breadth;
    }
}

class Circle extends Shape{       //child class of shape
	 private double radius;
	 
	 public Circle(double radius) {        // constructor
		 this.radius=radius;
	 }
	 
	 @Override
	 
	 public void displayArea() {             //method
		 double area= calculateArea();
		 System.out.println("Area of circle: " + area);
		 
	 }
	 public double calculateArea() {
		 return Math.PI * Math.pow(radius, 2);
	 }
}
	


class Triangle extends Shape{            //child class of shape
	private double base;
	private double height;
	
	public Triangle(double base, double height) {        // constructor
		
		this.base=base;
		this.height=height;
	}
	
	@Override
	
	public void displayArea() {              //method
		double area=calculateArea();
		System.out.println("Area of triangle: " + area);
	}
	
	public double calculateArea() {
		return 0.5 * base * height;
	}
	
}
	
    
	

public class area_dimensions {
	
	public static void main(String[]  args) {
		
		
		
		Rectangle rectangle= new Rectangle(65.6 ,54.6);  // Create objects for Rectangle, Circle, and Triangle
		Circle circle=new Circle(34.3);
		Triangle triangle=new Triangle(12.22, 14.54);
		
		
		
		
        ArrayList<Shape> shapeList = new ArrayList<Shape>();  // Create an ArrayList to store objects

        shapeList.add(rectangle);        // Add objects to the ArrayList
        shapeList.add(circle);
        shapeList.add(triangle);
       
       
        
        try {                       
            
            for (Shape shape : shapeList) {               
            	 shape.displayArea();                       // Display areas for each object in the ArrayList
            }
        } 
        catch (Exception e) {
            
         System.err.println("An error occurred: " + e.getMessage());  /* This line Handles exceptions, if they occur
                                                                          during the loop*/
        }
        
        finally {
            
         System.out.println("Finally block executed.");  /* Code that will be executed, 
                                                            whether an exception occurs or not*/
        }
        
	}
}

