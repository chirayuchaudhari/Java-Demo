package ScannerClass;
import java.util.Scanner;

public class ArithmaticOperation {

	public static void main(String[] args) {
		int a,b;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter 1st Number= ");
		a=sc.nextInt();
		
		System.out.print("Enter 2nd Number= ");
		b=sc.nextInt();
		
		int sum=a+b;
		System.out.println("Sum of given Number= "+sum);
		
		int sub=a-b;
		System.out.println("Substraction of given Number= "+sub);
		
		int mult=a*b;
		System.out.println("Multiplication of given Number= "+mult);
		
		int div=a/b;
		System.out.println("Division of given Number= "+div);
	}
}
