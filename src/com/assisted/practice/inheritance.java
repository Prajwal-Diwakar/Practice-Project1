package com.assisted.practice;

//Single inheritance
 class A {
		public void methodA()
				{
			System.out.println("Base class is A");
				}
	}
	
	class B extends A {
		public void methodB() 
		{
		System.out.println("child class method is B");
		}
	}
			
	public class inheritance{
		public static void main(String[] args) 
		{
		
			B obj=  new B();   //creating an object name obj 
				obj.methodA();   // calling the base class method
				obj.methodB();
		}
}
	
	

