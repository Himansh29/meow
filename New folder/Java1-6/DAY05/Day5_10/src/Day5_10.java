import java.util.Scanner;


public class Day5_10 
{

	public static void main(String[] args) 
	{
		int[] a1=new int[] {10,20,30,40};
		float[] a2=new float[] {1.1f,2.2f,3.3f};
		double[] a3=new double[] {9.9,7.5,6.5,5.5};
		
		//i = a1[0]  i=a1[1]  i=a1[2]  i=a1[3]
		System.out.println("Printing Integer Array Elements ");
		for(int i:a1)  
			System.out.print(i+"\t");
		
		System.out.println("\n Printing Float Array Elements");
		
		//f=a2[0]  f=a2[1] f=a2[2] 
		for(float f:a2)
			System.out.print(f+"\t");
		System.out.println("\n Printing Double  Array Elements");
		//d=a3[0] d=a3[1] d=a3[2] d=a3[3]
		for(double d:a3)
			System.out.print(d+"\t");
		
		
	}
}



/*
public class Day5_10 
{

	public static void main(String[] args) 
	{
		int[] a1=new int[] {10,20,30,40};
		float[] a2=new float[] {1.1f,2.2f,3.3f};
		double[] a3=new double[] {9.9,7.5,6.5,5.5};
		System.out.println("Class for Array : "+a1.getClass()); //class [I
		System.out.println("Class for Array : "+a2.getClass()); //class [F
		System.out.println("Class for Array : "+a3.getClass()); //class [D

		System.out.println("toString = "+a1.toString());  // [I@762efe5d
		System.out.println("toString = "+a2.toString()); //[F@5d22bbb7
		System.out.println("toString = "+a3.toString()); //[D@41a4555e
		
		System.out.println(" a1 = "+a1); // [I@762efe5d
		System.out.println(" a2 = "+a2); //[F@5d22bbb7
		System.out.println(" a3 = "+a3); //[D@41a4555e
		
	}
}
*/


/*
public class Day5_10 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		float arr[];
		System.out.println("Enter Number of elements to be inserted ");
		arr=new float[sc.nextInt()];
		
		System.out.println("Initial Array Elements are = ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
		
		System.out.println("\n Class for Array : "+arr.getClass()); // class[D
			
		
		System.out.println("Enter elements inside array : ");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextFloat();
		
		System.out.println("You have entered array elements as : ");
		// displaying the array elements using advanced for loop
		// for each loop
		
		
		//for each element 'ele' inside array 'arr'
		// display the elements 
		//ele = arr[0] ele=arr[1]  ele = arr[2] ele = arr[lenght-1]
		for(float ele:arr)
			System.out.print(" \t "+ele);
	
	}
}
*/




/*
public class Day5_10 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double[] d;
		System.out.println("Enter Number of elements to be inserted ");
		d=new double[sc.nextInt()];
		// if user enters 3 then 
		//d=new dobule[3];
		
		System.out.println("Initial Array Elements are = ");
		for(int i=0;i<d.length;i++)
			System.out.print(d[i]+"\t");
		
		System.out.println("\n Class for Array : "+d.getClass()); // class[D
		// [ represents 1D array
		// D reprents type Double 
		
		
		System.out.println("Enter elements inside array : ");
		for(int i=0;i<d.length;i++)
			d[i]=sc.nextDouble();
		
		System.out.println("You have entered array elements as : ");
		for(int i=0;i<d.length;i++)
			System.out.print(d[i]+"\t");
		
		
	}

}

*/