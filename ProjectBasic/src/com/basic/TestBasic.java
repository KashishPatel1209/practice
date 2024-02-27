package com.basic;

public class TestBasic {
	
	int num;//instance variable
	String name; 
	static int count;//class level or static
	
	void display()//instance method or member data, member method
	{
		int num1=5; //Local variable
		System.out.print(num++ );
		System.out.print(num1++ );
		System.out.print(count++ +"\n");
	}

	public static void main(String[] args) {
		
		TestBasic ob=new TestBasic();
		ob.display();//0 5 0
		
		TestBasic ob1=new TestBasic();
		ob1.display();// 0 5 1
		
		TestBasic ob2=new TestBasic();
		ob2.display();//0 5 2



	}

}
//java.util.Scanner//Package
//Scanner sc=new Scanner(System.in);
//int num;
//system.out.println("Enter number");
//num=sc.nextInt();

//System.out.println("Number="+num);//
