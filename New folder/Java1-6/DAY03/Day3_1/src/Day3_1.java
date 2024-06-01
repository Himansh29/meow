import java.util.Scanner;

// String , int , float 
//width specifiers 
// %10d  %5f  %15s 
// c++ setw()


public class Day3_1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num;
		float f;
		String str;
		System.out.println("Enter integer value ");
		num=sc.nextInt();
		System.out.println("enter float value");
		f=sc.nextFloat();
		System.out.println("enter string");
		str=sc.next();
		System.out.println(num+"\t"+f+"\t"+str);
		System.out.println(num+" "+f+" "+str);
		System.out.printf("%5d %7.5f %10s", num,f,str);
		System.out.printf("\n %-5d %7.5f %10s", num,f,str);
		sc.close();
	}
}



/*
// Scanner Example
// int value
// float value
// double value
// addition


public class Day3_1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num;
		float f;
		double d;
		System.out.println("Enter integer value ");
		num=sc.nextInt();
		System.out.println("enter float value");
		f=sc.nextFloat();
		System.out.println("enter double value");
		d=sc.nextDouble();
		System.out.println("Addition = "+(num+f+d));
		sc.close();
		

	}

}


*/
