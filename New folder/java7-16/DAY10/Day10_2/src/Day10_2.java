import java.util.InputMismatchException;
import java.util.Scanner;

/*
 
 // If we add catch(Exception e) block as the first catch block
 //while using multiple catch blocks then javac error
 // because other subclasses of matching catch blocks code becomes unreachaable
 
 // RULE : While using multiple catch blocks , generic catch block must be 
  // the last catch block in the porgram 
  

public class Day10_2 
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
		
		catch(Exception e) // generic catch block
		{
			System.out.println("input given is wrong");
		}
		
		catch(ArithmeticException e) // Unreachable 
		{
			System.out.println("Second number must not be zero");
		}
				
		
	}

}

*/





/*
public class Day10_2 
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
		
		catch(ArithmeticException e)
		{
			System.out.println("Second number must not be zero");
		}
				
		catch(Exception e) // generic catch block
		{
			System.out.println("input given is wrong");
		}
	}

}
*/


/*
public class Day10_2 
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
		
		//not recommended to combine more than one excception
		catch(ArithmeticException | InputMismatchException e )
		{
			System.out.println("Something is wrong in your input data");
		}
		
			
		finally
		{
			System.out.println("inside finally block ");
			sc.close();
		}
	}

}

*/



/*
public class Day10_2 
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
		
		catch(ArithmeticException e)
		{
			System.out.println("Second number must not be zero");
		}
		catch(InputMismatchException e)
		{
			System.out.println("You have entered wrong input");
		}
			
		finally
		{
			System.out.println("inside finally block ");
			sc.close();
		}
	}

}
*/



/*
public class Day10_2 {

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
		
		catch(ArithmeticException e)
		{
			System.out.println("Second number must not be zero");
		}
		catch(InputMismatchException e)
		{
			System.out.println("You have entered wrong input");
		}
			
	}

}
*/




/*

public class Day10_2 {

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
		
		catch(ArithmeticException e)
		{
			System.out.println("Second number must not be zero");
		}
			
	}

}


*/



/*
public class Day10_2 {

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
		try
		{
			res=num1/num2; 
			//if user enters num2=0 
			// jvm will throw one object / instance
			// new ArithmeticException 
			// ArithmeticException is extended from Exception class only 
			System.out.println("Result = "+res);
		}
		//Exception e = new ArithmeticException();
		catch(Exception e)
		{
			System.out.println("Second number must not be zero");
		}
			
	}

}

*/