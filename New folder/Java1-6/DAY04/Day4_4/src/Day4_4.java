import java.util.Scanner;

public class Day4_4 {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int num1;
		int num2;
		
		System.out.println("Enter Num1 ");
		num1=sc.nextInt();
		System.out.println("Enter Num2 ");
		num2=sc.nextInt();
		
		if(num1<num2)
			System.out.println("Num1 "+num1);
		else
			System.out.println("Num1 "+num1);
		
		System.out.println("Addition "+(num1+num2));
		
	}

}
