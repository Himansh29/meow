
//Varity Method

public class Day6_6 
{
	static void sum(int... argument) // variable argument array 
	{
		int result=0;
		//for(int ele:argument)
			//result  = result+ele;
		//System.out.println("Result = "+result);
		
		for(int i=0;i<argument.length;i++)
			result = result+argument[i];
		System.out.println("Result = "+result);
	}
	
	public static void main(String[] args) 
	{
		Day6_6.sum(10,20);
		Day6_6.sum(30,40,50);
		Day6_6.sum();
		Day6_6.sum(1,2,3,4);
		
		Day6_6.sum(50,60);
		

	}

}




/*
public class Day6_6 
{
	// Function Overloading 
	static void sum(int n1,int n2)
	{
		System.out.println("Addition = "+(n1+n2));
	}

	static void sum(int n1,int n2,int n3)
	{
		System.out.println("Addition = "+(n1+n2+n3));
	} 
	public static void main(String[] args) 
	{
		Day6_6.sum(10,20);
		Day6_6.sum(30,40,50);

	}

}

*/
