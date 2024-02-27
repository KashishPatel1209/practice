package com.basic;

import java.util.Scanner;

public class PatternProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many rows you want");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=i;j<row;j++)
			{
				
			System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
        
	}

}
