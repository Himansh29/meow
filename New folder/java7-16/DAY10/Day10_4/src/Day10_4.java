import java.util.InputMismatchException;
import java.util.Scanner;

public class Day10_4 {

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
			res=n1/n2;
			System.out.println("Division = "+res);
		}
		catch(ArithmeticException ex)
		{
			ex.printStackTrace();
			
		}
		catch(InputMismatchException e)
		{
			//System.out.println(e);
			System.out.println(e.getClass().getSimpleName());
		}
	}

}



/*
public class Day10_4 {

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
			res=n1/n2;
			System.out.println("Division = "+res);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex.getClass());
			// it represents fully qualified name of the class
			
			System.out.println(ex.getClass().getSimpleName());
			// it only represents the name of the class 
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
	}

}

*/


/*
public class Day10_4 {

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
			res=n1/n2;
			System.out.println("Division = "+res);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex); //toString() method
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
	}

}

*/
