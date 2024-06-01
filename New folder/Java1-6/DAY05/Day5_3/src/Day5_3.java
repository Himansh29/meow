import java.util.Scanner;



class Day5_3
{
	static int num1; // static field declaration  
	static int num2; // static field declaration 
	static Scanner sc; // static reference declaration 
	
	static
	{
		num1=5; // initializing the static field 
		num2=5; //initializing the static field 
		sc=new Scanner(System.in); // initialization of static reference inside static initialzer block 
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Num1 = "+num1+" Num2 = "+num2);
		System.out.println("Enter Num1 ");
		num1=sc.nextInt();
		System.out.println("Enter Num2");
		num2=sc.nextInt();
		System.out.println("Num1 = "+num1+" Num2 = "+num2);
	}
}


/*
class Day5_3
{
	static int num1;
	static int num2;
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("Enter Num1 ");
		num1=sc.nextInt();
		System.out.println("Enter Num2");
		num2=sc.nextInt();
		System.out.println("Num1 "+num1+" Num2 "+num2);
	}
}
*/


/*
public class Day5_3 
{
	static int num1; //static field
	static int num2; // static field 
	static Scanner sc = new Scanner(System.in); //static object 
	
	static void addition()
	{
		System.out.println("Enter Num1 ");
		num1=sc.nextInt();
		System.out.println("Enter Num2 ");
		num2=sc.nextInt();
		System.out.println("Num1 = "+num1+" Num2 = "+num2);
		System.out.println("Addition = "+(num1+num2));
	}
	

	public static void main(String[] args) 
	{
		// we can not call non static method from static mehtod
		// solution , make the non static method as static 
		
		//addition();  // VALID 
		Day5_3.addition(); // VALID
	}

}


*/
