package Basics;

import java.util.Scanner;

public class Student {

	
	public static void main(String[] args) {
	int totalmarks=500;
	Scanner sc=new Scanner(System.in);
		
	System.out.println("Enter sub1 Marks= ");
	int	sub1=sc.nextInt();
	
	System.out.println("Enter sub2 Marks= ");
	int	sub2=sc.nextInt();
	
	System.out.println("Enter sub3 Marks= ");
	int	sub3=sc.nextInt();
	
	System.out.println("Enter sub4 Marks= ");
	int	sub4=sc.nextInt();
	
	System.out.println("Enter sub5 Marks= ");
    int	sub5=sc.nextInt();
    
    int percentage=((sub1+sub2+sub3+sub4+sub5)*100)/totalmarks;
    		
    System.out.println(percentage);
    
    if(percentage>=60)
    {
    	System.out.println("first class");
    }
    else if(percentage>=75)
    {
    	System.out.println("Distinction");
    }
    else if(percentage<=35)
    {
    	System.out.println("fail");
    }
    else
    {
    	System.out.println("bye");
    }
		

	}

}
