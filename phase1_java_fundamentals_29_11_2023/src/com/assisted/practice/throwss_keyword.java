package com.assisted.practice;
import java.io.IOException;  

public class throwss_keyword {
	
	void m() throws IOException{  
		
	throw new IOException("device error");//checked exception  
	  }  
	void n() throws IOException{  
	m();  
	  }  
	void p(){  
	try{
	n();  
	   }
	catch(Exception e)
	{
	System.out.println("exception handled");
	}  
	}  
	public static void main(String args[]){  
		throwss_keyword obj=new throwss_keyword();  
		obj.p();  
	System.out.println("normal flow...");  
	  }  
	}



