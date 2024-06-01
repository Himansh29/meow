
//Requirement : user to enter age
// if age is 0 to 100 (valid) 

package p1;

import java.util.Scanner;



public class Day11_1 
{
	static void validateAge(int age)
	{
		try
		{
		if(age<=100 && age>=0)
			System.out.println("Age is Valid ");
		else
			throw new InvalidAgeException("Age is invalid");
		
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e);
		}
	}


	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age ");
		int age=sc.nextInt();
		validateAge(age);
				

	}

}
