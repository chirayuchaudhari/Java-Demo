package ScannerClass;

import java.util.Scanner;

public class AreaOfTringle {

	public static void main(String[] args) {
		double length,width;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Length= ");
		length=sc.nextDouble();
		
		System.out.print("Enter Width= ");
		width=sc.nextDouble();
		
		double Area=length*width;
		System.out.println("Area of Rectangle= "+Area);
		

	}

}
