

//Requirement 
// to take one number from user , command line argument 
// if number is more than 100
//it should throw the user define exception
// NumberIsGreaterException ( My own name of exception)

class NumberIsGreaterException extends Exception
{
	NumberIsGreaterException()
	{
		System.out.println("Range of number is greater than 100");
	}
}


public class Day10_6 {

	public static void main(String[] args)
	{
		try
		{
			int m=Integer.parseInt(args[0]);
			System.out.println("M value = "+m);
			if(m>100)
			{
				throw new NumberIsGreaterException();
				
			}
		}
		catch(NumberIsGreaterException e)
		{
			System.out.println("e "+e);
			System.out.println("getMessege "+e.getMessage());
			e.printStackTrace();
			System.out.println("Cause "+e.getCause());
			System.out.println("toString ="+e.toString());
			System.out.println("getClass "+e.getClass().getSimpleName());
			
		}
	}

}
