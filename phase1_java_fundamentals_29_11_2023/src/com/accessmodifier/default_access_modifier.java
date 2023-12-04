package com.accessmodifier;

// This is the default access modifier example
class  default_access_modifier1{
	
	void display() {
		
		System.out.println("You are using the default access modifier");
	}
}

public class default_access_modifier {
	
	public static void main(String[] args) {
		
		System.out.println("Default access modifier");
		default_access_modifier1 obj= new default_access_modifier1();
		obj.display();
		
	}

}
