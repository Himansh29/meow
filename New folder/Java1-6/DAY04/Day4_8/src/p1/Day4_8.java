package p1;

// c / c++ const keyword 
// java final keyword 

import java.util.Scanner;

public class Day4_8
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		final int num1;
		System.out.println("Enter one value ");
		num1=sc.nextInt();
		System.out.println(" Num1 "+num1);
		int num2=60;
		//num1=num2; // NOT ALLOWED 
		num2=num1; // ALLOWED
	}
}



/*

public class Day4_8 {

	public static void main(String[] args) 
	{
		final int num1; // final variable declaration 
		num1=60; // final variable assignment  (valid) 
		System.out.println("num "+num1);
		//num1++;
		

	}

}

*/



/*
public class Day4_8 {

	public static void main(String[] args) 
	{
		final int num1=50;
		System.out.println("num "+num1);
		//num1++; // can not modify final variables (read only) 

	}

}

*/
