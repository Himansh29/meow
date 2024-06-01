import java.util.Arrays;

// It is recommended to pass sorted array as an argument in binarySearch() 

public class Day6_2 {

	public static void main(String[] args) 
	{
		int a[]=new int[] {10,20,30,40};
		System.out.println(Arrays.binarySearch(a, 10));
		System.out.println(Arrays.binarySearch(a, 20));
		System.out.println(Arrays.binarySearch(a, 30));
		System.out.println(Arrays.binarySearch(a, 40));
		System.out.println(Arrays.binarySearch(a, 5));
	
		System.out.println(Arrays.binarySearch(a, 50));
		System.out.println(Arrays.binarySearch(a, 33));
	}
}


/* 
public class Day6_2 {

	public static void main(String[] args) 
	{
		int arr1[]=new int[] {44,45,46,10,12,14};  //10  12   14   44   45   46 
		System.out.println(Arrays.binarySearch(arr1, 46));
		System.out.println(Arrays.toString(arr1));  
		System.out.println(Arrays.binarySearch(arr1, 122)); 
		System.out.println(Arrays.binarySearch(arr1, 212)); 
		System.out.println(Arrays.binarySearch(arr1, 45)); 
		System.out.println(Arrays.binarySearch(arr1, 24)); 
		
		
		
		
		
	}
}

*/


/*
public class Day6_2 {

	public static void main(String[] args) 
	{
		int arr[]=new int[] {44,22,10,13}; 
		System.out.println(Arrays.binarySearch(arr, 22));
		System.out.println(Arrays.toString(arr)); //array elements will get displayed 
		System.out.println(Arrays.binarySearch(arr, 122)); // -4-1 = -5 
		System.out.println(Arrays.binarySearch(arr, 212)); // -4-1 = -5
		System.out.println(Arrays.binarySearch(arr, 45)); //-4-1=-5
		System.out.println(Arrays.binarySearch(arr, 24)); //-4-1 = -5 
		
		
	}
}
*/



/*
public class Day6_2 {

	public static void main(String[] args) 
	{
		int arr[]=new int[] {3,5,10,12,35,99,45,15}; 
		System.out.println(arr.toString()); // hashcode
		
		for(int i:arr) // length-1 //for each loop
			System.out.print("\t"+i);
		
		System.out.println();
		
		for(int i=0;i<arr.length;i++)
			System.out.print("\t"+arr[i]);
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Sorting the array elements ");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Search "+Arrays.binarySearch(arr, 12));
		//12 is at index 3 inside an array 
		
	}

}

*/