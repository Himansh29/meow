package p1;

import java.util.Scanner;

public class Test implements maths 
{

	@Override
	public void add() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number ");
		int a=sc.nextInt();
		System.out.println("Enter Second Number ");
		int b=sc.nextInt();
		System.out.println("Addition = "+(a+b));
		
	}

	@Override
	public void sub() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number ");
		int a=sc.nextInt();
		System.out.println("Enter Second Number ");
		int b=sc.nextInt();
		System.out.println("Subtraction = "+(a-b));
		
	}

	@Override
	public void mul() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number ");
		int a=sc.nextInt();
		System.out.println("Enter Second Number ");
		int b=sc.nextInt();
		System.out.println("Multiplication = "+(a*b));
		
	}

	@Override
	public void div()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number ");
		int a=sc.nextInt();
		System.out.println("Enter Second Number ");
		int b=sc.nextInt();
		System.out.println("Division = "+(a/b));
		
	}
	
}
