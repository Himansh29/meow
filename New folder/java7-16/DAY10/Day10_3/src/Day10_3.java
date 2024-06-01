import java.util.Scanner;


public class Day10_3
{
	
	public static void main(String[] args)
	{
		Scanner sc=null;
		sc=new Scanner(System.in);
		int num1;
		int num2;
		int res;
		System.out.println("Enter First Number :");
		num1=sc.nextInt();
		System.out.println("Enter Second Number :");
		num2=sc.nextInt();
		
		try(Scanner sc1=new Scanner(System.in)) // Try BLOCK Handler
		{
			res=num1/num2; 
			System.out.println("Result = "+res);
		}
		
	}
}




/*
//Recommended try block must have atleast one catch block to handle the exception

public class Day10_3
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		int num1;
		int num2;
		int res;
		try
		{
			System.out.println("Enter First Number :");
			num1=sc.nextInt();
			System.out.println("Enter Second Number :");
			num2=sc.nextInt();

			res=num1/num2; 
			System.out.println("Result = "+res);
		}
		finally
		{
			System.out.println("inside finally block");
		}
}
}

*/
