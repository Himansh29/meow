
//Requirement : user to enter age
// if age is 0 to 100 (valid) 

package p1;

import java.util.Scanner;



public class Day11_1 
{
	static void validateAge(int age) throws InvalidAgeException
	{
		
		if(age<=100 && age>=0)
			System.out.println("Age is Valid ");
		else
			throw new InvalidAgeException("Age is invalid");
		
		
	}


	public static void main(String[] args) throws InvalidAgeException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age ");
		int age=sc.nextInt();
		validateAge(age);
				

	}

}

//throws keyword is used for delegation of exception
// It is like the caller of the method should handle the exception



