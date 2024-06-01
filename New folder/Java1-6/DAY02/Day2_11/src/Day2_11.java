
// Take input from user (Scanner Class) 
// Name : String 
// Empid : int 
// Salary : float 

import java.util.Scanner;


public class Day2_11 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);//creating object of Scanner Class 
		String name;
		int empid;
		float salary;
		
		System.out.println("Enter Your name : ");
		name=sc.next();
		System.out.println("Enter Your Empid : ");
		empid=sc.nextInt();
		System.out.println("Enter Your Salary : ");
		salary=sc.nextFloat();
		System.out.println("Name = "+name);
		System.out.println("Empid = "+empid);
		System.out.println("Salary = "+salary);
		sc.close();
		
	}

}
