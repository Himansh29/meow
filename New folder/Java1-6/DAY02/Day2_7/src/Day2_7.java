



// take input using command line 

// a = 15
//b = 5.5f
//c = 3.5
//A = 15 B = 5.5 C = 3.5  
//Display Addition 

public class Day2_7 {

	public static void main(String[] args) 
	{
		int a=Integer.parseInt(args[0]); //String to int 
		float b=Float.parseFloat(args[1]); // String to float
		double c=Double.parseDouble(args[2]); // String to double 
		System.out.println("A = "+a+" B = "+b+" C = "+c);
		System.out.println("Addition = "+(a+b+c));
	}
}




/*
// Take two inputs from user using command line Arguments
// and perform addition


public class Day2_7 {

	public static void main(String[] args) 
	{
		//int a=args[0]; //Type Mismatch : javac  error
		//int b=args[1]; // type mismatch : javac error 
		
		//convert String to int 
		// parseInt()
		int a=Integer.parseInt(args[0]); 
		int b=Integer.parseInt(args[1]); 
		int c=a+b;
		System.out.println("Addition = "+c);
	}

}


*/