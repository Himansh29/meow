import java.util.Arrays;


//Shallow copy : reference copy
// Deep Copy : instance copy 

public class Day6_5 {

	public static void main(String[] args)
	{
		int arr1[]=new int[]{1,2,3,4};  
		int arr2[]=Arrays.copyOf(arr1, arr1.length); // DEEP COPY
		System.out.println(arr1); // different hash code
		System.out.println(arr2); // different hash code 
		
		
	}
}



/*
public class Day6_5 {

	public static void main(String[] args)
	{
		int arr1[]=new int[]{1,2,3,4};  
		int arr2[]=arr1; // arr2 reference (Shallow Copy)
		//copying a reference of arr1 in arr2 
		System.out.println(arr1);
		System.out.println(arr2);

	}

}

*/
