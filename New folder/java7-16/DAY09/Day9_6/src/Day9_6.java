import java.util.Scanner;

public class Day9_6 
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int n1;
		int n2;
		int res;
		try
		{
			System.out.println("Enter First Number :");
			n1=sc.nextInt();
			System.out.println("Enter Second Number :");
			n2=sc.nextInt();
			res=n1/n2; //if user supplied n2 value as 0
			// n1 / 0 ===> Exception Occured
			// throws one instance of type Exception 
			
			System.out.println("Division = "+res);
		}
		catch(Exception e) // Handler  // Exception Handling 
		{
			//Corrective statement
			System.out.println("Second Number can not be zero");
			
		}
	}
}
