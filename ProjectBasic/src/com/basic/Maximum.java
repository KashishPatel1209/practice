package com.basic;
import java.util.Scanner;

public class Maximum {
	
	int findMax(int a,int b, int c) {
		
		
		int m = a>b?(a>c?a:c):(b>c?b:c);
		return m;
			
	}

	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		Maximum ob = new Maximum();
		int result = ob.findMax(num1,num2,num3);
		System.out.println("maximum no is" +result);
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
