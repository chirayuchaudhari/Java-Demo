package ScannerClass;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		int r;
		double pi=3.14;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Radius of Circle= ");
		r=sc.nextInt();
		
		double area=pi*r*r;
		System.out.println("Area of Circle is= "+area);

		
	}

}
