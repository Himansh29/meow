import java.util.Arrays;
import java.util.Scanner;



//2D Array 

public class Day6_4
{
	public static void main(String[] args) 
	{
		int[][] arr=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		
		//for each int type of array 'row' inside 2D array arr
		for(int[] row:arr)  // row 0  row1   row2 
		{
			//for each int type of 'col' inside 1D array of row  
			for(int col:row)   //col = row0[0]  col=row0[1]  col=row0[2] 
			{
				System.out.print(col+"\t");
			}
		System.out.println();
		}
	}
}


/*
public class Day6_4
{
	public static void main(String[] args) 
	{
		int arr[]=new int[] {11,22,33,44};
		//i = arr[0]  i = arr[1]  i = arr[2]   i=arr[3] 
		for(int i:arr) //for each loop for 1D array
			System.out.print(i+"\t");
	}
}

*/




/*
public class Day6_4 
{
	static Scanner sc=new Scanner(System.in);
	static void acceptRecord(int arr[][])
	{
		
		System.out.println("Enter Array Elements : ");
		for(int row=0;row<arr.length;row++)
		{
			System.out.println("Enter "+row+" Data");
			for(int col=0;col<arr[row].length;col++)
			{
				arr[row][col]=sc.nextInt();
			}
		}
		
	}
	
	
	static void dispRecord(int[][] arr) 
	{
		System.out.println("Array Elements are : ");
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++)
			{
				System.out.print(arr[row][col]+"\t");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) 
	{
		int arr[][]=new int[4][3];
		//acceptRecord(arr);
		//dispRecord(arr);
		
		Day6_4.acceptRecord(arr);
		Day6_4.dispRecord(arr);
		
	}

	
}
*/




/*
public class Day6_4 {

	public static void main(String[] args) 
	{
		int arr1[][]=new int[4][3]; 
		System.out.println(arr1);
		System.out.println(arr1.toString());
		System.out.println(Arrays.toString(arr1[0])); //0th row data 0 0 0 
		System.out.println(arr1.length); //row size
		System.out.println(arr1[0].length); // column size 
		
		
	}
	
}
*/



/*
public class Day6_4 {

	public static void main(String[] args) 
	{
		int arr1[][]=new int[3][3]; //valid
		int arr2[][]=new int [4][2]; //valid
		int[][] arr3=new int[3][2]; //valid
		int[][]arr4=new int[][] {{1,2,3},{4,5,6},{7,8,9}}; // VALID 
		int[][]arr5=new int[][] {{1,2,3},{4,5,6},{7,8,9},{10,11,12}}; //VALID 
	}

}
*/