import java.util.Scanner;

// class Employee
// name, id, salary 

// package level visibility 

class Employee
{
	String name;
	int id;
	float salary;
	Scanner sc=new Scanner(System.in);
	
	void accept()
	{
		System.out.println("Enter Name : ");
		name=sc.next();
		System.out.println("Enter ID :");
		id=sc.nextInt();
		System.out.println("Enter Salary : ");
		salary = sc.nextFloat();
	
	}
	void disp()
	{
		System.out.println("Name = "+name);
		System.out.println("ID = "+id);
		System.out.println("Salary = "+salary);
		
	}
}


public class Day3_3 {

	public static void main(String[] args) 
	{
		Employee e1=null; // stack 
		e1=new Employee(); // heap area 
		e1.accept();
		e1.disp();
		
		
		Employee e2=new Employee();
		e2.name="Akshita"; // default access specifier 
		e2.id=123;
		e2.salary=60000;
		e2.disp();
		
		
	}
}





/*

public class Day3_3 {

	public static void main(String[] args) 
	{
		
		Employee e1=null; // reference variable // local variable of main() 
		// e1 will receive the memory from stack area
		// NPE Exception
		// java.lang.NullPointerException
		
		e1.accept(); // instance method
		// Runtime Exception (because object is holding null value ) 
		e1.disp(); // instance method 
		// instance method is a method which is called with the help of instance 

	}

}


*/





/*
public class Day3_3 {

	public static void main(String[] args) 
	{
		
		Employee e1; // reference variable // local variable of main() 
		// e1 will receive the memory from stack area
		e1.accept(); // javac error
		e1.disp(); // javac error 

	}

}

*/
