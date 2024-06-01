


class Math
{
	public static void sum(int num1,int num2)
	{
		System.out.println("Addition = "+(num1+num2));
	}
	public static void sub(int num1,int num2)
	{
		System.out.println("Subtraction = "+(num1-num2));
	}
	public static void mul(int num1,int num2)
	{
		System.out.println("Multiple  = "+(num1*num2));
	}
	
	public static void div(int num1,int num2)
	{
		System.out.println("Division  = "+(num1/num2));
	}
	
}



public class Day5_4 {

	public static void main(String[] args) 
	{
		Math.sum(5, 4);
		Math.sub(10,2);
		Math.mul(5, 5);
		Math.div(20, 10);

	}

}






/*
class Math
{
	void sum(int num1,int num2)
	{
		System.out.println("Addition = "+(num1+num2));
	}
	public static void sub(int num1,int num2)
	{
		System.out.println("Subtraction = "+(num1-num2));
	}
	public static void mul(int num1,int num2)
	{
		System.out.println("Multiple  = "+(num1*num2));
	}
	
	public static void div(int num1,int num2)
	{
		System.out.println("Division  = "+(num1/num2));
	}
	
}



public class Day5_4 {

	public static void main(String[] args) 
	{
		Math m1=new Math();
		m1.sum(20,15);  //call to non static method 
		// Non Static Method or Instance Method 
		
		Math.sub(50,10);
		// Static Methods OR Class Level Methods 
		
		Math.mul(20,30);
		Math.div(40,8);
		
		m1.sub(5, 4);// valid (not recommended)
		// static methods must be accesses in static way 
		m1.mul(4,3);// valid (not recommended)
		// static methods must be accesses in static way 

	}

}
*/