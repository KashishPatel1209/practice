package com.basic;

public class variable_scope {

	public static void main(String[] args) {
		
		int x;
		int y;
		 x=5;
		{
			int Y=6;
			System.out.print(x+""+Y);
		}
		System.out.println(x+""+y);
		// TODO Auto-generated method stub

	}

}
