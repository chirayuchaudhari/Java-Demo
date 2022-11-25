package Basics;

import java.util.Scanner;

public class SimpleInterest {
	int Interest(int a,int b,int c)
	{
		int d=a*b*c/100;
		return d;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Principle amount= ");
		int a=sc.nextInt();
		
		System.out.println("Enter Principle year= ");
		int b=sc.nextInt();
		
		System.out.println("Enter Principle rate of interest= ");
		int c=sc.nextInt();
		
		SimpleInterest si=new SimpleInterest();
		
		
		System.out.println("Simple Interest is "+si.Interest(a, b, c));
		
		

	}

}
