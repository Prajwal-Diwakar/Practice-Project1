package com.assisted.practice;


class x1 {
		public void methodx1() {
			System.out.println("Base class is A");
		}
	}
	
	class y extends x1{
		public void methody() 
		{
		System.out.println("child class method is B");
		}
		}
	
		class z extends y{
			public void methodz() 
			{
			System.out.println("child class method is z");
			}
		}
		
		public class x{
		
		public static void main(String[] args) 
		{
		
				z obj=  new z();
				obj.methodx1();
				obj.methody();
				obj.methodz();
		}
}
		
	
	
	
	
	
