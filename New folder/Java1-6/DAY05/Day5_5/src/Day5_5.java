import java.util.Scanner;

class Math
{
	
	public static void sum(int num1,int num2)
	{
		System.out.println("Addition = "+(num1+num2));
	}
	public static void sub(int num1,int num2)
	{
		System.out.println("Subtraction = "+(num1-num2));
	}
	public static void mul(int num1,int num2)
	{
		System.out.println("Multiple  = "+(num1*num2));
	}
	
	public static void div(int num1,int num2)
	{
		System.out.println("Division  = "+(num1/num2));
	}
	
}



public class Day5_5 
{
	static int choice;
	static Scanner sc=new Scanner(System.in);
	static int num1;
	static int num2;
	
	public static int accept()
	{
		System.out.println("Enter Num ");
		return sc.nextInt();
	}
	
	public static void main(String[] args) 
	{
		do
		{
			System.out.println("Enter Choice : 0:exit 1.Add 2.Sub 3.Mul 4.Div ");
			choice=sc.nextInt();
		
			switch(choice)
			{
			case 1:
				num1=accept();
				num2=accept();
				Math.sum(num1,num2);
			break;
			case 2:
				num1=accept();
				num2=accept();
				Math.sub(num1,num2);
			break;
			case 3:
				num1=accept();
				num2=accept();
				Math.mul(num1, num2);
			break;
			case 4:
				num1=accept();
				num2=accept();
				Math.div(num1, num2);
			break;
			
				
			}		
		}
		while(choice!=0);
	}

}



/*
public class Day5_5 
{
	static int choice;
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		do
		{
			System.out.println("Enter Choice : 0:exit 1.Add 2.Sub 3.Mul 4.Div ");
			choice=sc.nextInt();
		
			switch(choice)
			{
			case 1:
				Math.sum(5, 4);
			break;
			case 2:
				Math.sub(10,2);
			break;
			case 3:
				Math.mul(5, 5);
			break;
			case 4:
				Math.div(20, 10);
			break;
				
			}		
		}
		while(choice!=0);
	}

}

*/
