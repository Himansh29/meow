import java.util.InputMismatchException;
import java.util.Scanner;

public class Day10_5 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n1,n2,res;
		try
		{
			System.out.println("Enter First number :");
			n1=sc.nextInt();
			System.out.println("Enter Second number :");
			n2=sc.nextInt();
			
			if(n2==0)
			{
				throw new ArithmeticException();
			}
			
			res=n1/n2;
			System.out.println("Division = "+res);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex);
			
		}
		
	}

}

