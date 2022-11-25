package ScannerClass;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		double side;
		
		Scanner  sc=new Scanner(System.in);
		
		System.out.print("Enter Side of Square= ");
		side=sc.nextDouble();
		
		double areasquare=side*side;
		System.out.println("Area of square is= "+areasquare);

	}

}
