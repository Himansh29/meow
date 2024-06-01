import java.util.Scanner;

public class Day10_1 {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		int num1;
		int num2;
		int res;
		System.out.println("Enter First Number :");
		num1=sc.nextInt();
		System.out.println("Enter Second Number :");
		num2=sc.nextInt();
		
		res=num1/num2; 
		System.out.println("Result = "+res);
		
			
	}

}




/*
public class Day10_1 {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		int num1;
		int num2;
		int res;
		System.out.println("Enter First Number :");
		num1=sc.nextInt();
		System.out.println("Enter Second Number :");
		num2=sc.nextInt();
		
		res=num1/num2;
		// if user enters num2=0
		//jvm will throw 
		//throw new ArithmeticException object  
		System.out.println("Result = "+res);
		
			
	}

}

*/
