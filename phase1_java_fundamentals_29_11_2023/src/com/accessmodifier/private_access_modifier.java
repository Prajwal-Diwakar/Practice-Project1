package com.accessmodifier;


class private_access_modifier1
{ 
	
	
   private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
} 

public class private_access_modifier {
	
	public static void main(String[] args) {
	
	//private
			System.out.println("Private Access Specifier");
			private_access_modifier1  obj = new private_access_modifier1 (); 
	        //trying to access private method of another class 
	        //obj.display();


	
	

}
}