


public class Day5_7 
{

	public static void main(String[] args)
	{
		int[] arr=new int[] {11,22,33,44};
		//System.out.println(arr[0]);
		//System.out.println(arr[3]);
		System.out.println(arr[-4]); // Runtime Exception
			
	}
}





/*
public class Day5_7 
{

	public static void main(String[] args)
	{
		int[] arr=new int[] {11,22,33,44};
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
		
		System.out.println();
		
		int[] arr1=new int[] {10,20,30,40,50};
		for(int i=0;i<6;i++)
			System.out.print(arr1[i]+"\t");	
		
	}
}
*/



/*
public class Day5_7 
{

	public static void main(String[] args)
	{
		int[] arr=new int[3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		for(int i=0;i<4;i++)
		System.out.print("\t"+arr[i]);
		//arr[0] arr[1] arr[2] arr[3] 
		//for arr[3] it is throwing Exception
		// AIOOB Exception 
		
		
	}
}
*/



/*
public class Day5_7 
{

	public static void main(String[] args)
	{
		int[] arr=new int[3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		for(int i=0;i<3;i++)
		System.out.print("\t"+arr[i]);
		
	}
}
*/




/*
public class Day5_7 
{

	public static void main(String[] args)
	{
		int[] arr=new int[3];
		for(int i=0;i<3;i++)
		System.out.print("\t"+arr[i]);
		
	}
}
*/



/*
public class Day5_7 
{

	public static void main(String[] args)
	{
		int[] arr=new int[3];
		//int[] arr=null; // java.lang.NullPointerException
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
	}
}

*/





/*
public class Day5_7 
{

	public static void main(String[] args)
	{
		int arr1[] = null; //valid
		int[] arr2=null; //valid
		int arr3[]=new int[4]; // valid 
		int[] arr4=new int[5]; //valid 
		//int [arr5] =null ; // INVALID // javac error 
		int[] arr6=new int[-6]; // INVALID // negative array size 
		// run time exception 
		//NegativeArraySizeException
		int[] arr7= {10,20,30,40}; // VALID 
		int[] arr8=new int[] {10,20,30}; // VALID // Only Array Initilaizer is defined 
		//int[] arr9= new int[3]{10,20,30}; // Invaild //javac error
		
	}

}


*/
