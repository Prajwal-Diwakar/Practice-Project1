package com.assisted.practice;

//Java program to illustrate the
//concept of Hierarchical  inheritance

class A1 {
	
	public void methodA1(){
		System.out.println("class A");
	}
}

class B1 extends A1 {
	
	public void methodB1(){
		System.out.println("class B");
	}
}

class C extends A1 {
	
	public void methodC(){
		System.out.println("class C");
	}
}

class D extends A1 {
	
	public void methodD(){
		System.out.println("class D");
	}
}

//Driver Class
public class hierarchical_inheritance {
	
	public static void main(String[] args) {
		
		B1 obj_B1=new B1();
		obj_B1.methodA1();
		obj_B1.methodB1();
		
		C obj_C=new C();
		obj_C.methodA1();
		obj_C.methodC();
		
		D obj_D=new D();
		obj_D.methodA1();
		obj_D.methodD();
		
	}

}
