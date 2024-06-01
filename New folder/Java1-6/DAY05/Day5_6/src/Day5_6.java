// If we wish to access the more number of times static methods of any class

// then it is always good practice / recommended to use
// static import while importing a package.

// While reading : static import
// while writing syntactically : import static 


import static java.lang.Math.*; 

public class Day5_6 
{

	public static void main(String[] args) 
	{
		System.out.println(pow(4,2));
		System.out.println(sqrt(4));
		System.out.println(abs(-5.3));
		System.out.println(PI);
		System.out.println(min(66,22));
		System.out.println(max(66,22));
		
		

	}

}



/*
import java.lang.Math.*; 

public class Day5_6 
{

	public static void main(String[] args) 
	{
		System.out.println(Math.pow(4,2));
		System.out.println(Math.sqrt(4));
		System.out.println(Math.abs(-5.3));
		System.out.println(Math.PI);
		System.out.println(Math.min(66,22));
		System.out.println(Math.max(66,22));
		
		

	}

}

*/
