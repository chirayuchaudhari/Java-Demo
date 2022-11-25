package Basics;

import java.util.Scanner;

public class Cube {
	int calculatecube(int a)
	{
		int cube=a*a*a;
		return cube;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int a=sc.nextInt();
		
		Cube s=new Cube();
		
		System.out.println("Cube of is "+s.calculatecube(a));

	}

}
