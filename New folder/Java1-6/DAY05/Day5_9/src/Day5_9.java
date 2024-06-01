import java.util.Scanner;

//accept and display the array elements 
// using methods 

public class Day5_9 
{

	static Scanner sc=new Scanner(System.in);
	
	public static void acceptRecord(int arr[])
	{
		if(arr!=null)
		{	
		System.out.println("Enter Array Elements ");
		for(int index=0;index<3;index++)
		{
			arr[index]=sc.nextInt();
		}
		}
		else
			System.out.println("Cant accept elements because Array is null");
	}
	
	public static void dispRecord(int[] arr)
	{
		if(arr!=null)
		{
			System.out.println(" Array Elements are : ");
			for(int index=0;index<3;index++)
			{
				System.out.print(arr[index]+"\t");
			}
		}
		else
			System.out.println("Cant display elements because Array is null");
	}
	public static void main(String[] args) 
	{
		int arr[]=null;
		
		acceptRecord(arr);
		dispRecord(arr);
		
	}


	
}

