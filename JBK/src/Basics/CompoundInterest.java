package Basics;

import java.util.Scanner;

public class CompoundInterest {

	int compoundinterest(int a,int b,int c)
	{
		int p=(int) (a*b*c*Math.pow(2, 3));
		return p;
	}
	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter value");
		 int a = sc.nextInt();
		 
		 System.out.println("Enter value");
		 int b = sc.nextInt();
		 
		 System.out.println("Enter value");
		 int c = sc.nextInt();
		 
		 CompoundInterest ci=new CompoundInterest();
		 System.out.println(ci.compoundinterest(a, b, c));
		 
		 

	}

	

}
