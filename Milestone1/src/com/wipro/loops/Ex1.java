package com.wipro.loops;

public class Ex1 
{
	public static void main(String[] args)
	{
		int a=Integer.parseInt(args[0]);
		if(a<0)
			System.out.println("Negitive number");
		else if (a>0)
			System.out.println("Positive number");
		else
			System.out.println("Zero");
	}

}
