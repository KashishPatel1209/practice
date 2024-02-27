package com.basic;

public class Myclass {
	
	private int value;
	
	Myclass(){
		this(0);
		System.out.println("Default Constructor called");
	}
	Myclass(int value){
		this.value=value;
		System.out.println("Parameterized Constructor called with value:"+value);
	}
	public int getvalue() {
		return value;
	}

	public static void main(String[] args) {
		Myclass ob1=new Myclass();
		System.out.println("Value:"+ob1.getvalue());
		
		Myclass ob2=new Myclass(42);
		System.out.println("Value:"+ob2.getvalue());
		
		

	}

}
