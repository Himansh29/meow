import java.util.Scanner;

//accept and display the array elements 
// using methods 

public class Day5_8 
{

	static Scanner sc=new Scanner(System.in);
	
	public static void acceptRecord(int arr[])
	{
		System.out.println("Enter Array Elements ");
		for(int index=0;index<3;index++)
		{
			arr[index]=sc.nextInt();
		}
	}
	
	public static void dispRecord(int[] arr)
	{
		
		System.out.println(" Array Elements are : ");
		for(int index=0;index<3;index++)
		{
			System.out.print(arr[index]+"\t");
		}
	}
	
	public static void main(String[] args) 
	{
		int arr[]=new int[3];
		acceptRecord(arr);
		dispRecord(arr);
		
	}


	
}



/*
public class Day5_8 {

	public static void main(String[] args) 
	{
		int[] arr=new int[2];
		//arr[0]="Akshita"; // array is of type int
		// we are trying to store string inside it
		// Invalid 
		// Javac error 
		
		System.out.println(arr);
	}

}

*/


import java.util.Scanner; public class Armstrong { 	public static void main(String[] args) 	{ 		Scanner sc = new Scanner(System.in); 		int num,temp,a,arm=0; 		System.out.println("Enter the Number To Check Is it Armstrong or Not"); 		num = sc.nextInt(); 		temp = num; 		while(num>0) 		{ 			a = num%10; 			arm = arm + (a*a*a); 			num = num/10; 		} 		if(temp==arm) 		{ 		System.out.println("It is Armstrong Number"); 		} 		else 		{ 			System.out.println("It is Not a Armstrong number"); 		} 		sc.close(); 	} }



/*
public class Day5_8 {

	public static void main(String[] args) 
	{
		int[] arr=new int[0];
		System.out.println(arr[0]); // Exception

	}

}
*/
